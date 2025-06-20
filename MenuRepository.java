import java.util.ArrayList;
import java.util.List;

public class MenuRepository {
    private List<Menu> menuList;

    public MenuRepository() {
        menuList = new ArrayList<>();

        //DRINK - ESPRESSO
        menuList.add(new Menu("아이스 플랫 화이트", 5800, MenuCategory.DRINK, MenuSubCategory.ESPRESSO));
        menuList.add(new Menu("아이스 카페 아메리카노", 470, MenuCategory.DRINK, MenuSubCategory.ESPRESSO));

        //DRINK - COLD_BREW
        menuList.add(new Menu("씨솔트 카라멜 코드 브루", 6500, MenuCategory.DRINK, MenuSubCategory.COLD_BREW));
        menuList.add(new Menu("베르가못 콜드브루", 6000, MenuCategory.DRINK, MenuSubCategory.COLD_BREW));

        //DRINK - BLONDE
        menuList.add(new Menu("아이스 블론드 플랫 화이트", 5800, MenuCategory.DRINK, MenuSubCategory.BLONDE));
        menuList.add(new Menu("아이스 블론드 카페 아메리카노", 4700, MenuCategory.DRINK, MenuSubCategory.BLONDE));

        //FOOD - BLONDE
        menuList.add(new Menu("스코프 초콜릿 칩 스콘", 4900, MenuCategory.FOOD, MenuSubCategory.TASTY_JOURNEY));

        //FOOD - BLONDE
        menuList.add(new Menu("에그 클럽 샌드위치", 4500, MenuCategory.FOOD, MenuSubCategory.STARBUCKS_MORNING_SET));
        menuList.add(new Menu("멜티 치즈 베이컨 토스트", 5700, MenuCategory.FOOD, MenuSubCategory.STARBUCKS_MORNING_SET));

        //FOOD - BLONDE
        menuList.add(new Menu("블랙 사파이어 치즈 케이크", 9900, MenuCategory.FOOD, MenuSubCategory.CAKE_AND_MINI_DESSERT));
        menuList.add(new Menu("과일 생크림 케이크", 7900, MenuCategory.FOOD, MenuSubCategory.CAKE_AND_MINI_DESSERT));

        //GOODS - TUMBLER
        menuList.add(new Menu("블랙 사파이어 치즈 케이크", 9900, MenuCategory.GOODS, MenuSubCategory.TUMBLER));
        menuList.add(new Menu("과일 생크림 케이크", 7900, MenuCategory.GOODS, MenuSubCategory.TUMBLER));

        //GOODS - BLONDE
        menuList.add(new Menu("SS 시그니처 엘마 텀블러 473ml", 40000, MenuCategory.GOODS, MenuSubCategory.VACUUM_AND_BOTTLE));
        menuList.add(new Menu("SS 시그니처 단테 텀블러 710ㅢ", 49000, MenuCategory.GOODS, MenuSubCategory.VACUUM_AND_BOTTLE));
    }

    public List<Menu> getAllMenus() {
        return menuList;
    }

    public List<Menu> getMenusByCategory(MenuCategory category) {
        return menuList.stream()
                .filter(m -> m.getCategory() == category)
                .toList();
    }

    public List<Menu> getMenusBySubCategory(MenuSubCategory subCategory) {
        return menuList.stream()
                .filter(m -> m.getSubCategory() == subCategory)
                .toList();
    }

}
