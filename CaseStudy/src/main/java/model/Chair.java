package model;

public class Chair {
    private int id;
    private int rowChair;
    private int colChair;
    private boolean select;
    private ERoom room;
    private ETypeOfChair type;

    public Chair(int id, int rowChair, int colChair, boolean select, ERoom room, ETypeOfChair type) {
        this.id = id;
        this.rowChair = rowChair;
        this.colChair = colChair;
        this.select = select;
        this.room = room;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRowChair() {
        return rowChair;
    }

    public void setRowChair(int rowChair) {
        this.rowChair = rowChair;
    }

    public int getColChair() {
        return colChair;
    }

    public void setColChair(int colChair) {
        this.colChair = colChair;
    }

    public boolean isSelect() {
        return select;
    }

    public void setSelect(boolean select) {
        this.select = select;
    }

    public ERoom getRoom() {
        return room;
    }

    public void setRoom(ERoom room) {
        this.room = room;
    }

    public ETypeOfChair getType() {
        return type;
    }

    public void setType(ETypeOfChair type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "id=" + id +
                ", rowChair=" + rowChair +
                ", colChair=" + colChair +
                ", select=" + select +
                ", room=" + room +
                ", type=" + type +
                '}';
    }
}
