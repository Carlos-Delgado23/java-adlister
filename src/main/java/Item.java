public class Item {
    private long id;
    private String name;
    private double priceInCents;

    public Item(long id, String name, double priceInCents){
        this.id = id;
        this.name = name;
        this.priceInCents = priceInCents;
    }

    // GETTERS
    public long getId() { return id; }
    public String getName() { return name; }
    public double getPriceInCents() { return priceInCents; }

    // SETTERS
    public void setId(long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setPriceInCents(double priceInCents) { this.priceInCents = priceInCents; }
}

