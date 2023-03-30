package model;

public class Food {
    private long idFood;
    private ETypeOfFood typeOfFood;
    private String nameFood;
    private boolean status;

    public Food() {
    }

    public Food(long id, ETypeOfFood typeOfFood, String nameFood, boolean status) {
        this.idFood = id;
        this.typeOfFood = typeOfFood;
        this.nameFood = nameFood;
        this.status = status;
    }

    public long getIdFood() {
        return idFood;
    }

    public void setIdFood(long idFood) {
        this.idFood = idFood;
    }

    public ETypeOfFood getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(ETypeOfFood typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
