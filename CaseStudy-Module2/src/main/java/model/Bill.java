package model;

import java.util.Date;
import java.util.List;

public class Bill {
    private String id;
    private Table table;
    private Food food;
    private int quantity;
    private double totalMoney;
    private Date dateBill;

    public Bill() {
    }

    public Bill(String id, Table table, Food food, int quantity, double totalMoney, Date dateBill) {
        this.id = id;
        this.table = table;
        this.food = food;
        this.quantity = quantity;
        this.totalMoney = totalMoney;
        this.dateBill = dateBill;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Date getDateBill() {
        return dateBill;
    }

    public void setDateBill(Date dateBill) {
        this.dateBill = dateBill;
    }
}
