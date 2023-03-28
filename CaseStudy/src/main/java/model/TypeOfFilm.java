package model;

public enum TypeOfFilm {
    ACTION(1, "action"),
    CARTOON(2, "cartoon"),

    HORROR(3, "horror"),

    ROMANCE(4, "romance"),
    FAMILY(5, "family"),
    HISTORICAL(6, "historical"),
    OTHER(7, "other");
    private int id;
    private String name;

    TypeOfFilm(int id, String name) {
        this.id = id;
        this.name = name;
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
    public static TypeOfFilm getTypeByID(int id) {
        for (TypeOfFilm type : values()) {
            if(type.id == id) {
                return type;
            }
        }
        return null;
    }
    public static TypeOfFilm getTypeByName(String name) {
        for (TypeOfFilm type : values()) {
            if(type.getName().equals(name)){
                return type;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return "TypeOfFilm{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
