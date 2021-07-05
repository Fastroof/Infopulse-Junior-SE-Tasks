package task3;

import java.util.ArrayList;

public class Department {
    private String departmentName;
    private ArrayList<Teacher> teachers;
    private ArrayList<Group> groups;

    public Department(String departmentName, ArrayList<Teacher> teachers, ArrayList<Group> groups) {
        this.departmentName = departmentName;
        this.teachers = teachers;
        this.groups = groups;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", teachers=" + teachers +
                ", groups=" + groups +
                '}';
    }
}
