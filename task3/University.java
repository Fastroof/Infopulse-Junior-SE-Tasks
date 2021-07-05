package task3;

import java.util.ArrayList;
import java.util.Objects;

public class University {
    private String universityName;
    private ArrayList<Faculty> faculties;
    private ArrayList<Subject> subjects;

    public University(String universityName, ArrayList<Faculty> faculties, ArrayList<Subject> subjects) {
        if (faculties.isEmpty()) {
            throw new NullPointerException("University needs at least 1 faculty");
        }
        if (subjects.isEmpty()) {
            throw new NullPointerException("University needs at least 1 subject");
        }
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof University)) return false;
        University that = (University) o;
        return getUniversityName().equals(that.getUniversityName()) && getFaculties().equals(that.getFaculties()) && getSubjects().equals(that.getSubjects());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUniversityName(), getFaculties(), getSubjects());
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
