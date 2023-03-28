package model;

import java.util.Date;

public class Film {
    private int id;
    private String name;
    private int ageLimit;
    private int durationTime;
    private Date premiereDate;
    private TypeOfFilm type;
    private String country;
    private String actor;
    private String director;
    private String description;

    public Film(int id, String name, int ageLimit, int durationTime, Date premiereDate, TypeOfFilm type, String country, String actor, String director, String description) {
        this.id = id;
        this.name = name;
        this.ageLimit = ageLimit;
        this.durationTime = durationTime;
        this.premiereDate = premiereDate;
        this.type = type;
        this.country = country;
        this.actor = actor;
        this.director = director;
        this.description = description;
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

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    public int getDurationTime() {
        return durationTime;
    }

    public void setDurationTime(int durationTime) {
        this.durationTime = durationTime;
    }

    public Date getPremiereDate() {
        return premiereDate;
    }

    public void setPremiereDate(Date premiereDate) {
        this.premiereDate = premiereDate;
    }

    public TypeOfFilm getType() {
        return type;
    }

    public void setType(TypeOfFilm type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ageLimit=" + ageLimit +
                ", durationTime=" + durationTime +
                ", premiereDate=" + premiereDate +
                ", type=" + type +
                ", country='" + country + '\'' +
                ", actor='" + actor + '\'' +
                ", director='" + director + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
