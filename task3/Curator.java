package task3;

public class Curator extends Teacher {
    private Group group;

    public Curator(String name, int age, String phoneNumber, String emailAddress, double salary, Subject[] subjects,
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
    public String toString() {
        return "Curator{" +
                "group=" + group +
                "} " + super.toString();
    }
}
