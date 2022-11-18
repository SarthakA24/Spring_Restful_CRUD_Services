package io.github.sarthaka24.restfulservice.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private int rollNumber;
    private String name;
    private String email;
    private long contactNumber;

    public Student() {
    }

    public Student(int rollNumber, String name, String email, long contactNumber) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Student{" + "rollNumber=" + rollNumber + ", name='" + name + '\'' + ", email='" + email + '\'' + ", contactNumber=" + contactNumber + '}';
    }
}
