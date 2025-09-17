public class Product {
    private int id;
    private String name;
    private double price;
    private int manufacturerId;

    public Product(int id, String name, double price, int manufacturerId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturerId = manufacturerId;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getManufacturerId() { return manufacturerId; }
}