package task3;

import java.util.ArrayList;
import java.util.Objects;

public class Curator extends Teacher {
    private Group group;

    public Curator(String name, int age, String phoneNumber, String emailAddress, double salary, ArrayList<Subject> subjects,
                   Group group) {
        super(name, age, phoneNumber, emailAddress, salary, subjects);
        this.group = group;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Curator)) return false;
        Curator curator = (Curator) o;
        return getGroup().equals(curator.getGroup());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGroup());
    }

    @Override
    public String toString() {
        return "Curator{" +
                "group=" + group +
                "} " + super.toString();
    }
}
