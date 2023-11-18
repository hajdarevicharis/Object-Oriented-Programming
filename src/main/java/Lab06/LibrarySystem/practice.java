package Lab06.LibrarySystem;

import Practice.persons.person1;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

import Week3.Lab.DataBaseConnect;

public class practice {
    public static void main(String[] args) {
        /*
        DataBaseConnect db = new DataBaseConnect();

        try {
            db.getAllUsers();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        */

        record person(String name, int age) {
            public String printNameAndAge() {
                return this.name + " " + this.age;
            }
        }

        person haki = new person("haris", 20);

        String haki1 = haki.printNameAndAge();


    }
}
