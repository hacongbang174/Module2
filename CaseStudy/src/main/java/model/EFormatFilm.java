package model;

public enum EFormatFilm {
    _2D(1, 0, "2D"),
    _3D(2, 20000, "3D"),
    IMAX(3, 30000, "IMAX"),
    _4D(4, 40000, "4D");
    private long id;
    private double surcharge;

    private String name;
    EFormatFilm(long id, double surcharge, String name) {
        this.id = id;
        this.surcharge = surcharge;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getSurcharge() {
        return surcharge;
    }

    public void setSurcharge(double surcharge) {
        this.surcharge = surcharge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static EFormatFilm toFormat(long id) {
        for (EFormatFilm format : values()) {
            if (format.id == id) {
                return format;
            }
        }
        return null;
    }
    public static EFormatFilm getFormatByName(String name) {
        for (EFormatFilm format : values()) {
            if (format.getName().equals(name)) {
                return format;
            }
        }
        return null;
    }
}
