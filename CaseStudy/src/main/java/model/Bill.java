package model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Bill {
    private String id;
    private User user;
    private Date dateBill;
    private Set<BillDetail> billDetails = new HashSet<>();
}
