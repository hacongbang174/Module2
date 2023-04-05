package FacadePattern;

import java.util.List;

public class RandomListFacade {
        private ListFilter listFilter;
        private ListPrinter listPrinter;
        private RandomList randomList;
        private RandomNumber randomNumber;

        public RandomListFacade(ListFilter listFilter, ListPrinter listPrinter, RandomList randomList, RandomNumber randomNumber) {
                this.listFilter = listFilter;
                this.listPrinter = listPrinter;
                this.randomList = randomList;
                this.randomNumber = randomNumber;
        }

        public void printRandomEvenList(int size, int min, int max) {
                randomNumber.generateInteger(min,max);
                List<Integer> numbers = randomList.generateList(size,min,max);
                listFilter.filterOdd(numbers);
                listPrinter.printList(numbers);
        }
}
