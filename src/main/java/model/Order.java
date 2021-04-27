package model;

public class Order {
    private Client client;
    private Product product;
    private int quantity;

    public Order(Client client, Product product, int quantity)
    {
        this.client=client;
        this.product = product;
        this.quantity = quantity;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
