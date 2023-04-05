package FacadePattern;

public class Client {
    public static void main(String[] args) {
        RandomListFacade randomListFacade = new RandomListFacade(new ListFilter(),new ListPrinter(),new RandomList(), new RandomNumber());
        randomListFacade.printRandomEvenList(5,0,10);
    }
}
