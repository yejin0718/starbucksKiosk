public enum MenuSubCategory {
    //DRINK
    ESPRESSO(MenuCategory.DRINK),
    COLD_BREW(MenuCategory.DRINK),
    BLONDE(MenuCategory.DRINK),

    //FOOD
    TASTY_JOURNEY(MenuCategory.FOOD),
    STARBUCKS_MORNING_SET(MenuCategory.FOOD),
    CAKE_AND_MINI_DESSERT(MenuCategory.FOOD),

    //GOODS
    TUMBLER(MenuCategory.GOODS),
    VACUUM_AND_BOTTLE(MenuCategory.GOODS);

    private final MenuCategory parentCategory;

    MenuSubCategory(MenuCategory menuCategory) {
        this.parentCategory = menuCategory;
    }

    public MenuCategory getParentCategory() {
        return parentCategory;
    }
}
