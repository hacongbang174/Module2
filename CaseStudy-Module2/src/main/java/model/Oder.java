package model;

import repository.IModel;

import java.util.Date;
import java.util.List;

public class Oder implements IModel<Oder> {
    private int idOder;
    private String nameCustomer;
    private String nameFood;
    private int quantityFood;
    private double priceFood;
    private double totalMoney;
    private Date createDateOder;


    public Oder() {
    }

    public Oder(int idOder, String nameCustomer, String nameFood, int quantityFood, double priceFood, double totalMoney, Date createDateOder) {
        this.idOder = idOder;
        this.nameCustomer = nameCustomer;
        this.nameFood = nameFood;
        this.quantityFood = quantityFood;
        this.priceFood = priceFood;
        this.totalMoney = totalMoney;
        this.createDateOder = createDateOder;
    }

    public int getIdOder() {
        return idOder;
    }

    public void setIdOder(int idOder) {
        this.idOder = idOder;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public int getQuantityFood() {
        return quantityFood;
    }

    public void setQuantityFood(int quantityFood) {
        this.quantityFood = quantityFood;
    }

    public double getPriceFood() {
        return priceFood;
    }

    public void setPriceFood(double priceFood) {
        this.priceFood = priceFood;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Date getCreateDateOder() {
        return createDateOder;
    }

    public void setCreateDateOder(Date createDateOder) {
        this.createDateOder = createDateOder;
    }

    @Override
    public int getId() {
        return idOder;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void update(Oder obj) {
        this.idOder = obj.idOder;
        this.nameCustomer = obj.nameCustomer;
        this.nameFood = obj.nameFood;
        this.quantityFood = obj.quantityFood;
        this.priceFood = obj.priceFood;
        this.totalMoney = obj.totalMoney;
        this.createDateOder = obj.createDateOder;
    }

    @Override
    public Oder parseData(String line) {
        return null;
    }
}
