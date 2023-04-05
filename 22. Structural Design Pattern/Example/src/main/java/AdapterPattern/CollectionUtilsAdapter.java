package AdapterPattern;

import com.codegym.CollectionUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionUtilsAdapter implements CollectionOperations {
    @Override
    public int findMax(Set<Integer> numbers) {
        CollectionUtils collectionUtils = new CollectionUtils();
        List<Integer> list = new ArrayList<>();
        list.addAll(numbers);
        return collectionUtils.findMax(list);
    }
}
