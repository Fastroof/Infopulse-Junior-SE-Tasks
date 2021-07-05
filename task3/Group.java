package task3;

import java.util.ArrayList;
import java.util.Objects;

public class Group {
    private String groupName;
    private ArrayList<Student> students;
    private Curator curator;
    private ArrayList<Subject> subjectsList;
    private int specializationCode;

    public Group(String groupName, ArrayList<Student> students, Curator curator, ArrayList<Subject> subjectsList,
                 int specializationCode) {
        if ((students.size() < 6) || (students.size() > 30)) {
            throw new IllegalArgumentException("The number of students should be from 6 to 30.");
        }
        if (subjectsList.isEmpty()) {
            throw new NullPointerException("Group needs at least 1 subject");
        }
        this.groupName = groupName;
        this.students = students;
        this.curator = curator;
        this.subjectsList = subjectsList;
        this.specializationCode = specializationCode;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public Curator getCurator() {
        return curator;
    }

    public void setCurator(Curator curator) {
        this.curator = curator;
    }

    public ArrayList<Subject> getSubjectsList() {
        return subjectsList;
    }

    public void setSubjectsList(ArrayList<Subject> subjectsList) {
        this.subjectsList = subjectsList;
    }

    public int getSpecializationCode() {
        return specializationCode;
    }

    public void setSpecializationCode(int specializationCode) {
        this.specializationCode = specializationCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;
        Group group = (Group) o;
        return getSpecializationCode() == group.getSpecializationCode() && getGroupName().equals(group.getGroupName()) && getStudents().equals(group.getStudents()) && getCurator().equals(group.getCurator()) && getSubjectsList().equals(group.getSubjectsList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGroupName(), getStudents(), getCurator(), getSubjectsList(), getSpecializationCode());
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", students=" + students +
                ", curator=" + curator +
                ", subjectsList=" + subjectsList +
                ", specializationCode=" + specializationCode +
                '}';
    }
}
