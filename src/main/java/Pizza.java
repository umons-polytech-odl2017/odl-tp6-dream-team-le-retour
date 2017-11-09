public class Pizza implements Eatable {

    private String name;
    private float price;

    public Pizza(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getPrice() {
        return 0;
    }

    @Override
    public void add() {

    }

    @Override
    public void remove() {

    }
}
