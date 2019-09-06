package thread;

import bean.Apple;
import bean.Dish;
import tools.Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {

    public static List<Apple> filterGreenApple(List<Apple> inventory, Predicate pre) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple : inventory) {
            if (pre.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        List<Apple> applist = new ArrayList<Apple>();
//        applist.add(new Apple("green", 100));
//        applist.add(new Apple("red", 300));
//        applist.add(new Apple("yellow", 800));
//
//        List<Integer> intList = new ArrayList<Integer>();
//        intList.add(new Integer(1));
//        intList.add(new Integer(50));
//        intList.add(new Integer(35));
////        List<Apple> returnApp = FilterPredicate.filter(applist, (Apple apple) -> "red".equals(apple.getColor()));
//        List<Integer> intApp = FilterPredicate.filter(intList, (Integer a) -> (a > 40));
//
//        for(int i : intApp) {
//            System.out.println(i);
//        }
        List<String> menu = new ArrayList<String>();
        menu.add("fish");
        menu.add("vegetable");
        menu.add("meat");

        List<Dish> listDish = new ArrayList<>();
        listDish.add(new Dish("veg"));
        listDish.add(new Dish("apple"));
        listDish.add(new Dish("orange"));

        listDish.stream().filter(Dish::isVegetarian).forEach(d -> {
            System.out.println(d.getName());
        });


    }
}
