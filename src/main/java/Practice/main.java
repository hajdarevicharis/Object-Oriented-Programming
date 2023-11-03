package Practice;
import Practice.persons.person1;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        person1 haki = new person1("Haris",15,new Date());

        System.out.println(haki.toString());
        haki.addFriends("faki");
        haki.addFriends("sani");
        System.out.println(haki.printFriends());
    }
}
