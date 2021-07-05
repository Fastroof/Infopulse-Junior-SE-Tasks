package task3;

import java.util.ArrayList;

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
    public String toString() {
        return "Faculty{" +
                "facultyName='" + facultyName + '\'' +
                ", departments=" + departments +
                '}';
    }
}
