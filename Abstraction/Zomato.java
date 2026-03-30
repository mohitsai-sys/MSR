interface DeliveryService {
void placeOrder(String item, int quantity);
default void trackOrder() {
System.out.println("Tracking your order...");
}
}
final class FoodOrder implements DeliveryService {
final String restaurantName = "Pizza Hub";
FoodOrder() {
System.out.println("Welcome to " + restaurantName);
}
public void placeOrder(String item, int quantity) {
System.out.println("Order placed: " + item + " x" + quantity);
}
final void deliveryStatus() {
System.out.println("Your order is out for delivery");
}
}
public class Zomato {
public static void main(String[] args) {
FoodOrder order = new FoodOrder();
order.placeOrder("Burger", 2);
order.trackOrder();      // default method from interface
order.deliveryStatus();  // final method
    }
}