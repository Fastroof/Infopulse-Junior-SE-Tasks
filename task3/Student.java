package task3;

public class Student extends Person {
    public Student(String name, int age, String phoneNumber, String emailAddress) {
        super(name, age, phoneNumber, emailAddress);
    }

    @Override
    public String toString() {
        return "Student{} " + super.toString();
    }
}
