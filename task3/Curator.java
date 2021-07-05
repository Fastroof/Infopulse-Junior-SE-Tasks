package task3;

import java.util.ArrayList;

public class Curator extends Teacher {
    public Curator(String name, int age, String phoneNumber, String emailAddress, double salary,
                   ArrayList<Subject> subjects) {
        super(name, age, phoneNumber, emailAddress, salary, subjects);
    }

    @Override
    public String toString() {
        return "Curator{} " + super.toString();
    }
}
