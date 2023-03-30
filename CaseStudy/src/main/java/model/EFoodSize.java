package model;

public enum EFoodSize {
    SMALL(0,"SIZE_SMALL"), MEDIUM(0,"SIZE_MEDIUM"), LARGE(0, "SIZE_LARGE");
    private long idFoodSize;
    private String name;

    EFoodSize(long id, String name) {
        this.idFoodSize = id;
        this.name = name;
    }

    public long getIdFoodSize() {
        return idFoodSize;
    }

    public void setIdFoodSize(long idFoodSize) {
        this.idFoodSize = idFoodSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static EFoodSize getFoodSizeById(long id) {
        for (EFoodSize foodSize : values()) {
            if(foodSize.getIdFoodSize() == id){
                return foodSize;
            }
        }
        return null;
    }
    public static EFoodSize getFoodSizeByName(String name) {
        for (EFoodSize foodSize : values()) {
            if (foodSize.getName().equals(name)){
                return foodSize;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "EFoodSize{" +
                "id=" + idFoodSize +
                ", name='" + name + '\'' +
                '}';
    }
}
