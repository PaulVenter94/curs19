package ro.fasttrackit.curs19;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainStandard {
    public static void main(String[] args) {
        arrOperation(elem -> "Element: " + elem);
        arrOperation(elem -> elem + " hello");
        filterOperation(elem -> elem % 2 == 0);
        filterOperation(elem -> elem % 2 != 0);
        consumer(elem-> System.out.println(elem));
    }

    public static void consumer(Consumer<Integer> consumer) {
        int[] ints = {1, 2, 3, 4, 5};
        for (int elem : ints) {
            consumer.accept(elem);
        }
    }

    public static void filterOperation(Predicate<Integer> predicate) {
        int[] ints = {1, 2, 3, 4, 5};
        for (int elem : ints) {
            if (predicate.test(elem)) {
                System.out.println(elem);
            }
        }
    }

    public static void arrOperation(Function<Integer, String> transformer) {
        int[] ints = {1, 2, 3, 4, 5};
        for (int elem : ints) {
            System.out.println(transformer.apply(elem));
        }
    }
}
