import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items = new ArrayList<>();

    public void addItem(Menu menu, int quantity) {
        items.add(new CartItem(menu, quantity));
    }

    public void removeItem(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
        }
    }

    public void showCart() {
        int total = 0;
        for (int i=0; i<items.size(); i++) {
            CartItem item = items.get(i);
            System.out.println((i+1) + ". " + item.getMenu().getName() + " x" + item.getQuantity()
                    + " = " + item.getTotalPrice() + "원");
            total += item.getTotalPrice();
        }
    }

    public List<CartItem> getItems() {
        return items;
    }

    public int getTotalPrice() {
        return items.stream().mapToInt(CartItem::getTotalPrice).sum();
    }
}
