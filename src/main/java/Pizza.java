import java.util.ArrayList;
import java.util.List;

public class Pizza implements Eatable {

    private String name;
    private float price;
    List<Ingredient> recipe= new ArrayList<>();

    public Pizza(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getPrice() {
        price=0;
        for(Ingredient ingredient: recipe)
            price+=ingredient.getPrice();
        return price;
    }


    public void add(Ingredient i) {
        recipe.add(i);
    }


    public void remove(Ingredient i) {
        recipe.remove(i);
    }
}
