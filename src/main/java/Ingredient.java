public class Ingredient implements Food {

    private String name;
    private float price;

    public Ingredient(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public void add() {

    }

    @Override
    public void remove() {

    }
}
