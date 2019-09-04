package thread;

import bean.Apple;
import tools.Predicate;

import java.util.ArrayList;
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

        String[] strings = {"hello", "world", "hi", "sprin"};
        String[] strings2 = {"HELLO", "World", "world", "World", "World", "heLLo" };

        /**
         * Filter:过滤， 侧重于过滤。forEach:循环
         */
        Stream.of(strings).filter((a) -> a.startsWith("h")).forEach(System.out::println);

        /**
         * Sorted:排序
         */
        Stream.of(strings).sorted().forEach(System.out::println);

        Stream.of(strings2).distinct().forEach(System.out::println);

        Stream.of(strings2).map(String::toLowerCase).forEach(System.out::println);


        Stream.of(strings2).map(a->a.concat("_aa")).forEach(System.out::println);
    }
}
