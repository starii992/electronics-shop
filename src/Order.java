public class Order {
    private int id;
    private int productId;
    private int quantity;
    private double totalAmount;

    public Order(int id, int productId, int quantity, double totalAmount) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
    }

    public int getId() { return id; }
    public int getProductId() { return productId; }
    public int getQuantity() { return quantity; }
    public double getTotalAmount() { return totalAmount; }
}