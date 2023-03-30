package model;

public enum ETypeOfFood {
    DRINK(0,"DRINK_NAME"), FOOD(1,"FOOD_NAME");
    private long id;
    private String name;

    ETypeOfFood(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static ETypeOfFood getTypeOfFoodById(long id) {
        for (ETypeOfFood typeOfFood : values()) {
            if(typeOfFood.getId() == id) {
                return typeOfFood;
            }
        }
        return null;
    }
    public static ETypeOfFood getTypeOfFoodByName(String name) {
        for (ETypeOfFood typeOfFood : values()) {
            if (typeOfFood.getName().equals(name)){
                return typeOfFood;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "ETypeOfFood{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
