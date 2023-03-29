package model;

import java.util.HashSet;
import java.util.Set;

public class FoodDetail {
    private int id;
    private Food food;
    private FoodSize foodSize;
    private int price;
    private Boolean status;
    private Set<BillDetail> billDetailSet = new HashSet<>();
}
