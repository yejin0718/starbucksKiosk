public enum MenuCategory {
    DRINK("음료"),
    FOOD("푸드"),
    GOODS("상품");

    private final String displayName;

    MenuCategory(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
