package Lab04.People;

public class Person {
    public String name;
    public String address;
    private int age;
    private String country;

    public Person(String name, String address, String country, int age) {
        this.name = name;
        this.address = address;
        this.country = country;
        this.age = age;
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getCountry(){
        return country;
    }

    public int getAge() {
        return age;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setCountry(String newCountry) {
        this.country = newCountry;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }
    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address;
    }
}

