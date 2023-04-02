package stackqueue.Demerging;

import java.io.*;
import java.util.*;

public class DemergingUseQueue {
    public static void main(String[] args) throws IOException {

        Person p1 = new Person("Quốc Pháp", "Nam", new Date(1997,3,2));
        Person p2 = new Person("Bảo Thi", "Nữ", new Date(2000,2,1));
        Person p3 = new Person("Phước Đạt", "Nam",new Date(1998,2,12));
        Person p4 = new Person("Mao Mao", "Nữ", new Date(1994,11,18));
        Person p5 = new Person("Công Bằng", "Nam", new Date(1994,4,17));

        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                return person.getBirthDay().compareTo(t1.getBirthDay());
            }
        });
        System.out.println(personList);
        Queue<Person> Nam = new LinkedList<>();
        Queue<Person> Nu = new LinkedList<>();
        for (Person person : personList) {
            if(person.getGender() == "Nam") {
                Nam.add(person);
            }
            if(person.getGender() == "Nữ"){
                Nu.add(person);
            }
        }
        List<Person> personListNew = new ArrayList<>();
        while (!Nu.isEmpty()) {
            personListNew.add(Nu.remove());
        }
        while (!Nam.isEmpty()) {
            personListNew.add(Nam.remove());
        }
        System.out.println(personListNew);

    }

}
