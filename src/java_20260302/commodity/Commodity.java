package java_20260302.commodity;

public class Commodity {
    private String name;
    private int id;
    private double price;
    private int repertory;
    public Commodity(String name, int id, int price, int repertory) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.repertory = repertory;
    }

    public Commodity() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRepertory() {
        return repertory;
    }

    public void setRepertory(int repertory) {
        this.repertory = repertory;
    }
}
