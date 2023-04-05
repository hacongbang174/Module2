package AdapterPattern;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(17);
        numbers.add(18);
        numbers.add(24);
        numbers.add(4);
        numbers.add(11);
        CollectionUtilsAdapter collectionUtilsAdapter = new CollectionUtilsAdapter();
        int max = collectionUtilsAdapter.findMax(numbers);
        System.out.println(max);
    }
}
