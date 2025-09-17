import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Списки с данными
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Phone", 500.0, 1));
        products.add(new Product(2, "Laptop", 1000.0, 1));
        products.add(new Product(3, "TV", 800.0, 2));

        List<Manufacturer> manufacturers = new ArrayList<>();
        manufacturers.add(new Manufacturer(1, "Samsung"));
        manufacturers.add(new Manufacturer(2, "LG"));

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, 1, 2, 1000.0)); // 2 телефона по 500 = 1000
        orders.add(new Order(2, 2, 1, 1000.0)); // 1 ноутбук
        orders.add(new Order(3, 3, 1, 800.0));  // 1 TV

        // Поиск по производителю
        System.out.println("Товары от Samsung:");
        for (Product p : products) {
            if (p.getManufacturerId() == 1) {
                System.out.println(p.getName() + " - $" + p.getPrice());
            }
        }

        // Фильтрация по сумме заказа от 900
        System.out.println("\nЗаказы дороже $900:");
        for (Order o : orders) {
            if (o.getTotalAmount() > 900) {
                System.out.println("Заказ #" + o.getId() + ": $" + o.getTotalAmount());
            }
        }
    }
}