package task3;

import java.util.ArrayList;

public class University {
    private String universityName;
    private ArrayList<Faculty> faculties;
    private ArrayList<Subject> subjects;

    public University(String universityName, ArrayList<Faculty> faculties, ArrayList<Subject> subjects) {
        this.universityName = universityName;
        this.faculties = faculties;
        this.subjects = subjects;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public ArrayList<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(ArrayList<Faculty> faculties) {
        this.faculties = faculties;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "University{" +
                "universityName='" + universityName + '\'' +
                ", faculties=" + faculties +
                ", subjects=" + subjects +
                '}';
    }
}
