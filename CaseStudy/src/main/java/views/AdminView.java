package views;

import model.Ticket;
import service.FilmService;

import java.util.Scanner;

public class AdminView {
    Scanner sc = new Scanner(System.in);
    private FilmView filmView;
    private ShowTimeView showTimeView;
    private TicketView ticketView;
    private FoodView foodView;
    private EmployeeView employeeView;
    private CustomerView customerView;
    private BillView billView;
}
