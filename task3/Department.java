package task3;

import java.util.ArrayList;
import java.util.Objects;

public class Department {
    private String departmentName;
    private ArrayList<Teacher> teachers;
    private ArrayList<Group> groups;

    public Department(String departmentName, ArrayList<Teacher> teachers, ArrayList<Group> groups) {
        if (groups == null) {
            throw new NullPointerException("Department needs at least 1 group");
        }
        if (teachers.size() < 3) {
            throw new NullPointerException("Department needs at least 3 teachers");
        }
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return getDepartmentName().equals(that.getDepartmentName()) && getTeachers().equals(that.getTeachers()) && getGroups().equals(that.getGroups());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDepartmentName(), getTeachers(), getGroups());
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
