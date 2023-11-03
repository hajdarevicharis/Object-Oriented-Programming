package Practice.persons;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class person1 {
    private String name;
    private int age;
    private Date date;
    private List<String> friends;

    public person1(String name, int age, Date date) {
        this.name = name;
        this.age = age;
        this.date = date;
        this.friends = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nDate: " + date;
    }

    public String printFriends() {
        return convertList(friends);
    }

    public String convertList(List<String> friends) {
        for(String friend : friends) {
            System.out.println(friend);
        }
        return "end";
    }

    public void addFriends(String friend) {
        friends.add(friend);
    }

    public void displayInfo() {
        System.out.println("Name: "+ name);
    }
}

