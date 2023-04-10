package model;

import repository.IModel;

public class Food implements IModel<Food> {
    private int idFood;
    private String nameFood;
    private Double priceFood;
    private ETypeOfFood eTypeOfFood;

    public Food() {
    }

    public Food(int idFood, String nameFood, Double priceFood, ETypeOfFood eTypeOfFood) {
        this.idFood = idFood;
        this.nameFood = nameFood;
        this.priceFood = priceFood;
        this.eTypeOfFood = eTypeOfFood;
    }

    public int getIdFood() {
        return idFood;
    }

    public void setIdFood(int idFood) {
        this.idFood = idFood;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public Double getPriceFood() {
        return priceFood;
    }

    public void setPriceFood(Double priceFood) {
        this.priceFood = priceFood;
    }

    public ETypeOfFood geteTypeOfFood() {
        return eTypeOfFood;
    }

    public void seteTypeOfFood(ETypeOfFood eTypeOfFood) {
        this.eTypeOfFood = eTypeOfFood;
    }

    @Override
    public int getId() {
        return idFood;
    }

    @Override
    public void update(Food obj) {
        this.idFood = obj.idFood;
        this.nameFood = obj.nameFood;
        this.priceFood = obj.priceFood;
        this.eTypeOfFood = obj.eTypeOfFood;
    }

    @Override
    public Food parseData(String line) {
       Food food = new Food();
       String[] strings = line.split(",");
       int id = Integer.parseInt(strings[0]);
       String name = strings[1];
       Double price = Double.parseDouble(strings[2]);
       ETypeOfFood typeOfFood = ETypeOfFood.getTypeOfFoodByName(strings[3]);
       food.setIdFood(id);
       food.setNameFood(name);
       food.setPriceFood(price);
       food.seteTypeOfFood(typeOfFood);
       return food;
    }

    @Override
    public String toString() {
        return this.idFood + ", " + this.nameFood + ", " + this.priceFood + ", " + this.eTypeOfFood.getName();
    }
}
