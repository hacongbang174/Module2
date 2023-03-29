package model;

import java.util.HashSet;
import java.util.Set;

public class FoodSize {
    private String id;
    private String name;
    private Set<FoodDetail> foodDetailSet = new HashSet<>(0);
}
