package model;

public class Table {
    private int idTable;
    private String nameTable;

    public Table(int idTable, String nameTable) {
        this.idTable = idTable;
        this.nameTable = nameTable;
    }

    public int getIdTable() {
        return idTable;
    }

    public void setIdTable(int idTable) {
        this.idTable = idTable;
    }

    public String getNameTable() {
        return nameTable;
    }

    public void setNameTable(String nameTable) {
        this.nameTable = nameTable;
    }
}
