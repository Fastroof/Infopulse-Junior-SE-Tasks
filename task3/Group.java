package task3;

import java.util.ArrayList;

public class Group {
    private String groupName;
    private ArrayList<Student> students;
    private Curator curator;
    private ArrayList<Subject> subjectsList;
    private int specializationCode;

    public Group(String groupName, ArrayList<Student> students, Curator curator, ArrayList<Subject> subjectsList,
                 int specializationCode) {
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