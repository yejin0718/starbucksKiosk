import java.util.ArrayList;
import java.util.List;

public class MenuRepository {
    private List<Menu> menuList;

    public MenuRepository() {
        menuList = new ArrayList<>();

        //DRINK - ESPRESSO
        menuList.add(new Menu("아이스 플랫 화이트", 5800, MenuCategory.DRINK, MenuSubCategory.ESPRESSO));
        menuList.add(new Menu("아이스 카페 아메리카노", 4700, MenuCategory.DRINK, MenuSubCategory.ESPRESSO));
        menuList.add(new Menu("아이스 카페 라떼", 5200, MenuCategory.DRINK, MenuSubCategory.ESPRESSO));
        menuList.add(new Menu("아이스 스타벅스 돌체 라떼", 6100, MenuCategory.DRINK, MenuSubCategory.ESPRESSO));
        menuList.add(new Menu("아이스 카페 모카", 5700, MenuCategory.DRINK, MenuSubCategory.ESPRESSO));
        menuList.add(new Menu("아이스 카푸치노", 5200, MenuCategory.DRINK, MenuSubCategory.ESPRESSO));
        menuList.add(new Menu("아이스 카라멜 마키야또", 6100, MenuCategory.DRINK, MenuSubCategory.ESPRESSO));
        menuList.add(new Menu("아이스 화이트 초콜릿 모카", 6100, MenuCategory.DRINK, MenuSubCategory.ESPRESSO));
        menuList.add(new Menu("커피 스타벅스 더블 샷", 5300, MenuCategory.DRINK, MenuSubCategory.ESPRESSO));
        menuList.add(new Menu("바닐라 스타벅스 더블 샷", 5300, MenuCategory.DRINK, MenuSubCategory.ESPRESSO));
        menuList.add(new Menu("헤이즐넛 스타벅스 더블 샷", 5300, MenuCategory.DRINK, MenuSubCategory.ESPRESSO));
        menuList.add(new Menu("에스프레소", 3900, MenuCategory.DRINK, MenuSubCategory.ESPRESSO));
        menuList.add(new Menu("에스프레소 마키야또", 3900, MenuCategory.DRINK, MenuSubCategory.ESPRESSO));
        menuList.add(new Menu("에스프레소 콘 파나", 4100, MenuCategory.DRINK, MenuSubCategory.ESPRESSO));

        //DRINK - COLD_BREW
        menuList.add(new Menu("씨솔트 카라멜 코드 브루", 6500, MenuCategory.DRINK, MenuSubCategory.COLD_BREW));
        menuList.add(new Menu("베르가못 콜드브루", 6000, MenuCategory.DRINK, MenuSubCategory.COLD_BREW));
        menuList.add(new Menu("콜드 브루", 5100, MenuCategory.DRINK, MenuSubCategory.COLD_BREW));
        menuList.add(new Menu("시그니처 더 블랙 콜드 브루", 20400, MenuCategory.DRINK, MenuSubCategory.COLD_BREW));
        menuList.add(new Menu("돌체 콜드 브루", 6000, MenuCategory.DRINK, MenuSubCategory.COLD_BREW));
        menuList.add(new Menu("바닐라 크림 콜드 브루", 6000, MenuCategory.DRINK, MenuSubCategory.COLD_BREW));
        menuList.add(new Menu("오트 콜드 브루", 6000, MenuCategory.DRINK, MenuSubCategory.COLD_BREW));
        menuList.add(new Menu("나이트로 바닐라 크림", 6300, MenuCategory.DRINK, MenuSubCategory.COLD_BREW));
        menuList.add(new Menu("나이트로 콜드 브루", 6200, MenuCategory.DRINK, MenuSubCategory.COLD_BREW));
        menuList.add(new Menu("흑임자 크림 콜드 브루", 7500, MenuCategory.DRINK, MenuSubCategory.COLD_BREW));
        menuList.add(new Menu("여수 윤슬 헤이즐넛 콜드브루", 7500, MenuCategory.DRINK, MenuSubCategory.COLD_BREW));

        //DRINK - BLONDE
        menuList.add(new Menu("아이스 블론드 플랫 화이트", 5800, MenuCategory.DRINK, MenuSubCategory.BLONDE));
        menuList.add(new Menu("아이스 블론드 카페 아메리카노", 4700, MenuCategory.DRINK, MenuSubCategory.BLONDE));
        menuList.add(new Menu("아이스 블론드 카페 라떼", 5200, MenuCategory.DRINK, MenuSubCategory.BLONDE));
        menuList.add(new Menu("아이스 블론드 바닐라 더블샷 마키아또", 6100, MenuCategory.DRINK, MenuSubCategory.BLONDE));
        menuList.add(new Menu("아이스 블론드 스타벅스 돌체 라떼", 6100, MenuCategory.DRINK, MenuSubCategory.BLONDE));
        menuList.add(new Menu("아이스 블론드 카페 모카", 5700, MenuCategory.DRINK, MenuSubCategory.BLONDE));
        menuList.add(new Menu("아이스 블론드 카푸치노", 5200, MenuCategory.DRINK, MenuSubCategory.BLONDE));
        menuList.add(new Menu("아이스 블론드 카라멜 마키아또", 6100, MenuCategory.DRINK, MenuSubCategory.BLONDE));
        menuList.add(new Menu("아이스 블론드 화이트 초콜릿 모카", 6100, MenuCategory.DRINK, MenuSubCategory.BLONDE));
        menuList.add(new Menu("블론드 커피 스타벅스 더블 샷", 5300, MenuCategory.DRINK, MenuSubCategory.BLONDE));
        menuList.add(new Menu("블론드 바닐라 스타벅스 더블 샷", 5300, MenuCategory.DRINK, MenuSubCategory.BLONDE));
        menuList.add(new Menu("블론드 헤이즐넛 스타벅스 더블 샷", 5300, MenuCategory.DRINK, MenuSubCategory.BLONDE));
        menuList.add(new Menu("블론드 에스프레소", 3900, MenuCategory.DRINK, MenuSubCategory.BLONDE));
        menuList.add(new Menu("블론드 에스프레소 마키야또", 3900, MenuCategory.DRINK, MenuSubCategory.BLONDE));
        menuList.add(new Menu("블론드 에스프레소 콘 파냐", 4100, MenuCategory.DRINK, MenuSubCategory.BLONDE));

        //DRINK - DECAF_COFFEE
        menuList.add(new Menu("아이스 디카페인 플랫 화이트", 6100, MenuCategory.DRINK, MenuSubCategory.DECAF_COFFEE));
        menuList.add(new Menu("아이스 디카페인 카페 아메리카노", 5000, MenuCategory.DRINK, MenuSubCategory.DECAF_COFFEE));
        menuList.add(new Menu("아이스 디카페인 카페 라떼", 5500, MenuCategory.DRINK, MenuSubCategory.DECAF_COFFEE));
        menuList.add(new Menu("아이스 디카페인 스타벅스 돌체 라떼", 6400, MenuCategory.DRINK, MenuSubCategory.DECAF_COFFEE));
        menuList.add(new Menu("아이스 디카페인 카라멜 마키아또", 6400, MenuCategory.DRINK, MenuSubCategory.DECAF_COFFEE));
        menuList.add(new Menu("아이스 디카페인 카페 모카", 6000, MenuCategory.DRINK, MenuSubCategory.DECAF_COFFEE));
        menuList.add(new Menu("아이스 디카페인 카푸치노", 5500, MenuCategory.DRINK, MenuSubCategory.DECAF_COFFEE));
        menuList.add(new Menu("아이스 디카페인 화이트 초콜릿 모카", 6400, MenuCategory.DRINK, MenuSubCategory.DECAF_COFFEE));
        menuList.add(new Menu("디카페인 커피 스타벅스 더블 샷", 5600, MenuCategory.DRINK, MenuSubCategory.DECAF_COFFEE));
        menuList.add(new Menu("디카페인 바닐라 스타벅스 더블 샷", 5600, MenuCategory.DRINK, MenuSubCategory.DECAF_COFFEE));
        menuList.add(new Menu("디카페인 헤이즐넛 스타벅스 더블 샷", 5600, MenuCategory.DRINK, MenuSubCategory.DECAF_COFFEE));
        menuList.add(new Menu("디카페인 에스프레소", 4200, MenuCategory.DRINK, MenuSubCategory.DECAF_COFFEE));
        menuList.add(new Menu("디카페인 에스프레소 콘 파나", 4400, MenuCategory.DRINK, MenuSubCategory.DECAF_COFFEE));
        menuList.add(new Menu("디카페인 에스프레소 마키아또", 4200, MenuCategory.DRINK, MenuSubCategory.DECAF_COFFEE));
        menuList.add(new Menu("아이스 1/2디카페인 플랫 화이트", 6100, MenuCategory.DRINK, MenuSubCategory.DECAF_COFFEE));
        menuList.add(new Menu("아이스 1/2디카페인 스타벅스 돌체 라떼", 6400, MenuCategory.DRINK, MenuSubCategory.DECAF_COFFEE));
        menuList.add(new Menu("아이스 1/2디카페인 카라멜 마키아또", 6400, MenuCategory.DRINK, MenuSubCategory.DECAF_COFFEE));
        menuList.add(new Menu("아이스 1/2디카페인 카페 라떼", 5500, MenuCategory.DRINK, MenuSubCategory.DECAF_COFFEE));
        menuList.add(new Menu("아이스 1/2디카페인 카페 아메리카노", 5000, MenuCategory.DRINK, MenuSubCategory.DECAF_COFFEE));
        menuList.add(new Menu("아이스 1/2디카페인 카페 모카", 6000, MenuCategory.DRINK, MenuSubCategory.DECAF_COFFEE));
        menuList.add(new Menu("아이스 1/2디카페인 카푸치노", 5500, MenuCategory.DRINK, MenuSubCategory.DECAF_COFFEE));
        menuList.add(new Menu("아이스 1/2디카페인 화이트 초콜릿 모카", 6400, MenuCategory.DRINK, MenuSubCategory.DECAF_COFFEE));
        menuList.add(new Menu("1/2디카페인 커피 스타벅스 더블 샷", 5600, MenuCategory.DRINK, MenuSubCategory.DECAF_COFFEE));
        menuList.add(new Menu("1/2디카페인 바닐라 스타벅스 더블 샷", 5600, MenuCategory.DRINK, MenuSubCategory.DECAF_COFFEE));
        menuList.add(new Menu("1/2디카페인 헤이즐넛 스타벅스 더블 샷", 5600, MenuCategory.DRINK, MenuSubCategory.DECAF_COFFEE));
        menuList.add(new Menu("1/2디카페인 에스프레소", 4200, MenuCategory.DRINK, MenuSubCategory.DECAF_COFFEE));
        menuList.add(new Menu("1/2디카페인 에스프레소 콘 파나", 4400, MenuCategory.DRINK, MenuSubCategory.DECAF_COFFEE));
        menuList.add(new Menu("1/2디카페인 에스프레소 마키아또", 4200, MenuCategory.DRINK, MenuSubCategory.DECAF_COFFEE));

        //DRINK - STARBUCKS_FIZZIO
        menuList.add(new Menu("쿨 라임 피지오", 6100, MenuCategory.DRINK, MenuSubCategory.STARBUCKS_FIZZIO));
        menuList.add(new Menu("라이트 핑크 자몽 피지오", 6300, MenuCategory.DRINK, MenuSubCategory.STARBUCKS_FIZZIO));

        //DRINK - FRAPPUCCINO
        menuList.add(new Menu("자몽 망고 코코 프라푸치노", 7100, MenuCategory.DRINK, MenuSubCategory.FRAPPUCCINO));
        menuList.add(new Menu("칩 앤 칩 모카 프라푸치노", 6700, MenuCategory.DRINK, MenuSubCategory.FRAPPUCCINO));
        menuList.add(new Menu("더블 에스프레소 칩 프라푸치노", 6500, MenuCategory.DRINK, MenuSubCategory.FRAPPUCCINO));
        menuList.add(new Menu("제주 말차 크림 프라푸치노", 6500, MenuCategory.DRINK, MenuSubCategory.FRAPPUCCINO));
        menuList.add(new Menu("자바칩 프라푸치노", 6500, MenuCategory.DRINK, MenuSubCategory.FRAPPUCCINO));
        menuList.add(new Menu("초콜릿 크림 칩 프라푸치노", 6200, MenuCategory.DRINK, MenuSubCategory.FRAPPUCCINO));
        menuList.add(new Menu("카라멜 프라푸치노", 6100, MenuCategory.DRINK, MenuSubCategory.FRAPPUCCINO));
        menuList.add(new Menu("에스프레소 프라푸치노", 5700, MenuCategory.DRINK, MenuSubCategory.FRAPPUCCINO));
        menuList.add(new Menu("제주 까망 크림 프라푸치노", 7500, MenuCategory.DRINK, MenuSubCategory.FRAPPUCCINO));
        menuList.add(new Menu("제주 쑥떡 크림 프라푸치노", 7500, MenuCategory.DRINK, MenuSubCategory.FRAPPUCCINO));
        menuList.add(new Menu("화이트 타이거 프라푸치노", 6500, MenuCategory.DRINK, MenuSubCategory.FRAPPUCCINO));
        menuList.add(new Menu("인절미 제주 말차 크림 프라푸치노", 8500, MenuCategory.DRINK, MenuSubCategory.FRAPPUCCINO));

        //FOOD - TASTY_JOURNEY
        menuList.add(new Menu("스코프 초콜릿 칩 스콘", 4900, MenuCategory.FOOD, MenuSubCategory.TASTY_JOURNEY));

        //FOOD - STARBUCKS_MORNING_SET
        menuList.add(new Menu("에그 클럽 샌드위치", 4500, MenuCategory.FOOD, MenuSubCategory.STARBUCKS_MORNING_SET));
        menuList.add(new Menu("멜티 치즈 베이컨 토스트", 5700, MenuCategory.FOOD, MenuSubCategory.STARBUCKS_MORNING_SET));
        menuList.add(new Menu("더블 에그 브렉퍼스트 & 체다 샌드위치", 5700, MenuCategory.FOOD, MenuSubCategory.STARBUCKS_MORNING_SET));
        menuList.add(new Menu("치킨 베이컨 랩", 6500, MenuCategory.FOOD, MenuSubCategory.STARBUCKS_MORNING_SET));
        menuList.add(new Menu("탕종 플레인 베이글", 3300, MenuCategory.FOOD, MenuSubCategory.STARBUCKS_MORNING_SET));

        //FOOD - CAKE_AND_MINI_DESSERT
        menuList.add(new Menu("블랙 사파이어 치즈 케이크", 9900, MenuCategory.FOOD, MenuSubCategory.CAKE_AND_MINI_DESSERT));
        menuList.add(new Menu("과일 생크림 케이크", 7900, MenuCategory.FOOD, MenuSubCategory.CAKE_AND_MINI_DESSERT));
        menuList.add(new Menu("딸기 촉촉 초코 생크림 케이크", 8300, MenuCategory.FOOD, MenuSubCategory.CAKE_AND_MINI_DESSERT));
        menuList.add(new Menu("초코 품은 부생카", 5500, MenuCategory.FOOD, MenuSubCategory.CAKE_AND_MINI_DESSERT));
        menuList.add(new Menu("레이디핑거 티라미수 케이크", 6900, MenuCategory.FOOD, MenuSubCategory.CAKE_AND_MINI_DESSERT));
        menuList.add(new Menu("바스크 초코 치즈 케이크", 7300, MenuCategory.FOOD, MenuSubCategory.CAKE_AND_MINI_DESSERT));
        menuList.add(new Menu("생크림 크레이프 롤", 7500, MenuCategory.FOOD, MenuSubCategory.CAKE_AND_MINI_DESSERT));

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
