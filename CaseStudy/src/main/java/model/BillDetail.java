package model;

public class BillDetail extends Bill {
    private int id;
    private int quantity;
    private int totalMoney;
    private FoodDetail foodDetail;

    public BillDetail() {
    }

    public BillDetail(int id, int quantity, int totalMoney, FoodDetail foodDetail) {
        this.id = id;
        this.quantity = quantity;
        this.totalMoney = totalMoney;
        this.foodDetail = foodDetail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    public FoodDetail getFoodDetail() {
        return foodDetail;
    }

    public void setFoodDetail(FoodDetail foodDetail) {
        this.foodDetail = foodDetail;
    }
}
