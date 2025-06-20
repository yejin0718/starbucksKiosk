import java.time.LocalDateTime;

public class Order {
    private Cart cart;
    private LocalDateTime orderTime;

    public Order(Cart cart) {
        this.cart = cart;
        this.orderTime = LocalDateTime.now();
    }

    public void printReceipt() {
        System.out.println("=== 영수증 ===");
        cart.showCart();
        System.out.println("주문 시간: " + orderTime);
    }
}
