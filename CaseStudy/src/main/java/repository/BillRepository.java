package repository;

import model.Bill;

public class BillRepository extends FileContext<Bill>{
    public BillRepository() {
        filePath = "./data/order.csv";
        tClass = Bill.class;
    }
}
