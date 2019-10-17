package tools;

import bean.Apple;

public interface Predicate<T> {
    boolean test(T a);

}
