package model;

import java.util.HashSet;
import java.util.Set;

public class Food {
    private String id;
    private TypeOfFood typeOfFood;
    private String nameFood;
    private boolean status;
    private Set<FoodDetail> foodDetailSet = new HashSet<FoodDetail>(0);
}
