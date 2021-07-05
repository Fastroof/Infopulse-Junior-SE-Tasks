package task3;

import java.util.ArrayList;
import java.util.Objects;

public class Faculty {
    private String facultyName;
    private ArrayList<Department> departments;

    public Faculty(String facultyName, ArrayList<Department> departments) {
        this.facultyName = facultyName;
        this.departments = departments;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faculty)) return false;
        Faculty faculty = (Faculty) o;
        return getFacultyName().equals(faculty.getFacultyName()) && getDepartments().equals(faculty.getDepartments());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFacultyName(), getDepartments());
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "facultyName='" + facultyName + '\'' +
                ", departments=" + departments +
                '}';
    }
}
