package model;

public enum ETypeOfChair {
    NORMAL(1, "normal seat", 0),
    COUPLE(2, "couple seat", 0);
    private int id;
    private String name;
    private double surcharge;

    ETypeOfChair(int id, String name, double surcharge) {
        this.id = id;
        this.name = name;
        this.surcharge = surcharge;
    }

    public int getId() {
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

    public double getSurcharge() {
        return surcharge;
    }

    public void setSurcharge(double surcharge) {
        this.surcharge = surcharge;
    }
    public static ETypeOfChair getTypeByID(int id) {
        for (ETypeOfChair type : values()) {
            if(type.id == id) {
                return type;
            }
        }
        return null;
    }
    public static ETypeOfChair getTypeByName(String name) {
        for (ETypeOfChair type : values()) {
            if(type.getName().equals(name)){
                return type;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "ETypeOfChair{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surcharge=" + surcharge +
                '}';
    }
}
