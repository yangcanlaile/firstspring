package bean;

public class Dish {
    public String name;

    public Dish(String name) {
        this.name = name;
    }

    public static boolean isVegetarian(Dish d) {

        return "veg".equals(d.getName());
    }

    public String getName() {
        return name;
    }
}
