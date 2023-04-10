package model;

public enum EPosition {
    MASTER(0,"MASTER"), MANAGER(1,"MANAGER"), EMPLOYEE(2,"EMPLOYEE"), CUSTOMER(3,"CUSTOMER");
    private long idPosition;
    private String name;

    EPosition(long id, String name) {
        this.idPosition = id;
        this.name = name;
    }

    public long getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(long idPosition) {
        this.idPosition = idPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static EPosition getPositionById(long id) {
        for (EPosition position : values()) {
            if(position.getIdPosition() == id){
                return position;
            }
        }
        return null;
    }
    public static EPosition getPositionByName(String name) {
        for (EPosition position : values()) {
            if (position.getName().equals(name)){
                return position;
            }
        }
        return null;
    }
}
