import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private final Scanner scanner = new Scanner(System.in);
    private final MenuRepository menuRepo = new MenuRepository();
    private final Cart cart = new Cart();
    private KioskMode mode;

    public void start() {
        showWelcomeScreen();
    }

    //키오스크 첫 화면
    private void showWelcomeScreen() {
        while (true) {
            System.out.println("\n=== ☕스타벅스 키오스크☕ ===");
            System.out.println("1. 먹고가기");
            System.out.println("2. 포장하기");
            System.out.println("0. 종료");
            System.out.print(">> ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: {
                    mode = KioskMode.EAT_IN;
                    showCategoryScreen();
                }
                case 2: {
                    mode = KioskMode.TAKE_OUT;
                    showCategoryScreen();
                }
                case 0: {
                    exit();
                    return;
                }
                default: System.out.println("잘못된 입력입니다.");
            }
        }
    }

    //대분류 선택 화면
    private void showCategoryScreen() {
        while (true) {
            System.out.println("\n== 메뉴 대분류 선택 ==");
            for (MenuCategory category : MenuCategory.values()) {
                System.out.println(category.ordinal() + 1 + ". " + category.getDisplayName());
            }
            System.out.println("4. 장바구니 조회");
            System.out.println("0. 처음으로");
            System.out.print(">> ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: {
                    showSubCategoryScreen(MenuCategory.DRINK);
                    break;
                }
                case 2: {
                    showSubCategoryScreen(MenuCategory.FOOD);
                    break;
                }
                case 3: {
                    showSubCategoryScreen(MenuCategory.GOODS);
                    break;
                }
                case 4: {
                    showCartScreen();
                    break;
                }
                case 0: {
                    showWelcomeScreen();
                    return;
                }
                default: System.out.println("잘못된 입력입니다.");
            }
        }
    }

    //소분류 선택 화면
    private void showSubCategoryScreen(MenuCategory category) {
        while (true) {
            System.out.println("\n== 소분류 선택 (" + category.getDisplayName() + ") ==");

            // 소분류 필터링
            List<MenuSubCategory> filteredSubs = new ArrayList<>();
            for (MenuSubCategory sub : MenuSubCategory.values()) {
                if (sub.getParentCategory() == category) {
                    filteredSubs.add(sub);
                }
            }

            // 번호와 함께 출력
            for (int i = 0; i < filteredSubs.size(); i++) {
                System.out.println((i + 1) + ". " + filteredSubs.get(i).getDisplayName());
            }

            int cartIndex = filteredSubs.size() + 1;
            System.out.println(cartIndex + ". 장바구니 조회");
            System.out.println("0. 이전으로");
            System.out.print(">> ");

            int input = scanner.nextInt();
            scanner.nextLine();

            if (input == 0) {
                showCategoryScreen();
                return;
            }

            if (input == cartIndex) {
                showCartScreen();
                return;
            }

            if (input >= 1 && input <= filteredSubs.size()) {
                MenuSubCategory selected = filteredSubs.get(input - 1);
                showMenuListScreen(selected);
                return;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    //메뉴 조회 화면
    private void showMenuListScreen(MenuSubCategory subCategory) {
        while (true) {
            System.out.println("\n== 메뉴 조회 (" + subCategory + ") ==");
            var menus = menuRepo.getMenusBySubCategory(subCategory);
            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + ". " + menus.get(i).getName() + " - " + menus.get(i).getPrice() + "원");
            }

            System.out.println((menus.size() + 1) + ". 장바구니 조회");
            System.out.println("0. 이전으로");
            System.out.print(">> ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                showSubCategoryScreen(subCategory.getParentCategory());
                return;
            }

            if (choice == menus.size() + 1) {
                showCartScreen();
                return;
            }

            if (choice >= 1 && choice <= menus.size()) {
                showOrderDetailScreen(menus.get(choice - 1));
                return;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    //메뉴 상세 주문 화면
    private void showOrderDetailScreen(Menu menu) {
        while (true) {
            System.out.println("\n== 주문 화면 ==");
            System.out.println("상품명: " + menu.getName());
            System.out.println("가격: " + menu.getPrice() + "원");

            System.out.println("1. 장바구니 담기");
            System.out.println("2. 장바구니 조회");
            System.out.println("0. 이전으로");
            System.out.print(">> ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: {
                    System.out.print("수량 입력: ");
                    int qty = scanner.nextInt();
                    scanner.nextLine();
                    cart.addItem(menu, qty);
                    System.out.println("✅ 장바구니에 담겼습니다!");
                }
                case 2: {
                    showCartScreen();
                    return;
                }
                case 0: {
                    showMenuListScreen(menu.getSubCategory());
                    return;
                }
                default: System.out.println("잘못된 입력입니다.");
            }
        }
    }

    //장바구니 화면
    private void showCartScreen() {
        while (true) {
            System.out.println("\n== 🛒 장바구니 ==");
            cart.showCart();

            System.out.println("1. 항목 삭제");
            System.out.println("2. 결제하기");
            System.out.println("3. 계속 쇼핑하기");
            System.out.print(">> ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: {
                    System.out.print("삭제할 항목 번호: ");
                    int idx = scanner.nextInt();
                    scanner.nextLine();
                    cart.removeItem(idx - 1);
                }
                case 2: {
                    checkout();
                    return;
                }
                case 3: {
                    showCategoryScreen();
                    return;
                }
                default: System.out.println("잘못된 입력입니다.");
            }
        }
    }

    //결제 화면
    private void checkout() {
        System.out.println("\n=== [영수증] ===");
        cart.showCart();
        System.out.println("주문 방식: " + (mode == KioskMode.EAT_IN ? "매장 이용" : "포장"));
        System.out.println("결제 완료. 감사합니다! ☕");
        exit();
    }

    //키오스크 종료
    private void exit() {
        System.out.println("키오스크를 종료합니다.");
        System.exit(0);
    }
}
