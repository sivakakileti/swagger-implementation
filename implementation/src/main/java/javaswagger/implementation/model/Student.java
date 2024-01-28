package javaswagger.implementation.model;

import java.util.List;
import java.util.Objects;

public class Student {



    String firstName;
    String lastName;
    int rollNum;
    String department;
    int rank;
    List<String> contacts;

    public Student(String firstName, String lastName, int rollNum, String department, int rank, List<String> contacts) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNum = rollNum;
        this.department = department;
        this.rank = rank;
        this.contacts = contacts;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public List<String> getContacts() {
        return contacts;
    }

    public void setContacts(List<String> contacts) {
        this.contacts = contacts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNum == student.rollNum && rank == student.rank && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(department, student.department) && Objects.equals(contacts, student.contacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, rollNum, department, rank, contacts);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rollNum=" + rollNum +
                ", department='" + department + '\'' +
                ", rank=" + rank +
                ", contacts=" + contacts +
                '}';
    }
}
