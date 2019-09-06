package bean;

public class Dish {
    public String name;

    public Dish(String name) {
        this.name = name;
    }

    public static boolean isVegetarian(Dish d) {

        if ("veg".equals(d.getName())) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }
}
