package J05070;

public class Club {
    private String id, name;
    private int price;
    public Club() {}
    public Club(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public String getId() {
        return id;
    }
    public int getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
}