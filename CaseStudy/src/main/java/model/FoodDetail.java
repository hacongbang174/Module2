package model;

public class FoodDetail extends Food {
    private long idFoodDetail;
    private double price;
    private EFoodSize foodSize;
    public FoodDetail(){

    }
    public FoodDetail(long idFoodDetail, double price, EFoodSize foodSize) {
        this.idFoodDetail = idFoodDetail;
        this.price = price;
        this.foodSize = foodSize;
    }

    public FoodDetail(long id, ETypeOfFood typeOfFood, String nameFood, boolean status, long idFoodDetail, double price, EFoodSize foodSize) {
        super(id, typeOfFood, nameFood, status);
        this.idFoodDetail = idFoodDetail;
        this.price = price;
        this.foodSize = foodSize;
    }

    public long getIdFoodDetail() {
        return idFoodDetail;
    }

    public void setIdFoodDetail(long idFoodDetail) {
        this.idFoodDetail = idFoodDetail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public EFoodSize getFoodSize() {
        return foodSize;
    }

    public void setFoodSize(EFoodSize foodSize) {
        this.foodSize = foodSize;
    }
}
