package task3;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private String phoneNumber;
    private String emailAddress;

    public Person(String name, int age, String phoneNumber, String emailAddress) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && getName().equals(person.getName()) && Objects.equals(getPhoneNumber(),
                person.getPhoneNumber()) && Objects.equals(getEmailAddress(), person.getEmailAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getPhoneNumber(), getEmailAddress());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
