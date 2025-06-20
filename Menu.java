public class Menu {
    private String name;
    private int price;
    private MenuCategory category;
    private MenuSubCategory subCategory;

    public Menu(String name, int price, MenuCategory category,  MenuSubCategory subCategory) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.subCategory = subCategory;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public MenuCategory getCategory() {
        return category;
    }

    public MenuSubCategory getSubCategory() {
        return subCategory;
    }
}
