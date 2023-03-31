package views;


import service.FilmService;
import service.OrderService;

import java.util.Scanner;

public class FilmView {
    private FilmService filmService;
    private OrderService orderService;
    Scanner sc = new Scanner(System.in);

    public FilmView() {
        filmService = new FilmService();
        orderService = new OrderService();
    }

    public FilmView(FilmService filmService, OrderService orderService) {
        this.filmService = filmService;
        this.orderService = orderService;
    }
}
