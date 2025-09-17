import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Phone", 500.0, 1));
        products.add(new Product(2, "Laptop", 1000.0, 1));
        products.add(new Product(3, "TV", 800.0, 2));

        List<Manufacturer> manufacturers = new ArrayList<>();
        manufacturers.add(new Manufacturer(1, "Samsung"));
        manufacturers.add(new Manufacturer(2, "LG"));

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, 1, 2, 1000.0));
        orders.add(new Order(2, 2, 1, 1000.0));
        orders.add(new Order(3, 3, 1, 800.0));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nМагазин электроники(версия с конфликтом)");
            System.out.println("1. Поиск товаров по производителю");
            System.out.println("2. Фильтрация заказов по сумме");
            System.out.println("3. Выход");
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Введите ID производителя (1 - Samsung, 2 - LG): ");
                int manufacturerId = scanner.nextInt();
                System.out.println("Товары от производителя:");
                for (Product p : products) {
                    if (p.getManufacturerId() == manufacturerId) {
                        System.out.println(p.getName() + " - $" + p.getPrice());
                    }
                }
            } else if (choice == 2) {
                System.out.print("Введите минимальную сумму заказа: ");
                double minAmount = scanner.nextDouble();
                System.out.println("Заказы дороже $" + minAmount + ":");
                for (Order o : orders) {
                    if (o.getTotalAmount() > minAmount) {
                        System.out.println("Заказ #" + o.getId() + ": $" + o.getTotalAmount());
                    }
                }
            } else if (choice == 3) {
                break;
            }
        }
        scanner.close();
    }
}