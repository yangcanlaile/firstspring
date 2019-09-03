package tools;

import bean.Apple;

public interface Predicate<T> {
    public boolean test(T a);

}
