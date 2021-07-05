package task3;

import java.util.ArrayList;

public class Teacher extends Person {
    private double salary;
    private ArrayList<Subject> subjects;

    public Teacher(String name, int age, String phoneNumber, String emailAddress, double salary,
                   ArrayList<Subject> subjects) {
        super(name, age, phoneNumber, emailAddress);
        this.salary = salary;
        this.subjects = subjects;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                ", subjects=" + subjects +
                "} " + super.toString();
    }
}
