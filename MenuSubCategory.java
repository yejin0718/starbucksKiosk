public enum MenuSubCategory {
    //DRINK
    ESPRESSO(MenuCategory.DRINK, "에스프레소"),
    COLD_BREW(MenuCategory.DRINK, "콜드 브루"),
    BLONDE(MenuCategory.DRINK, "블론드"),
    DECAF_COFFEE(MenuCategory.DRINK, "디카페인 커피"),
    STARBUCKS_FIZZIO(MenuCategory.DRINK, "스타벅스 피지오"),

    //FOOD
    TASTY_JOURNEY(MenuCategory.FOOD, "테이스티 저니"),
    STARBUCKS_MORNING_SET(MenuCategory.FOOD, "스타벅스 모닝 세트"),
    CAKE_AND_MINI_DESSERT(MenuCategory.FOOD, "케이크&미니디저트"),

    //GOODS
    TUMBLER(MenuCategory.GOODS, "텀블러"),
    VACUUM_AND_BOTTLE(MenuCategory.GOODS, "보온병/보틀");

    private final MenuCategory parentCategory;
    private final String displayName;

    MenuSubCategory(MenuCategory menuCategory, String displayName) {
        this.parentCategory = menuCategory;
        this.displayName = displayName;
    }

    public MenuCategory getParentCategory() {
        return parentCategory;
    }

    public String getDisplayName() {
        return displayName;
    }
}
