package com.company;

public class Student extends User {

    private String group;

    public Student(String name) {
        super(name);
    }

    @Override
    public int compareTo(User o) {
        int result = 0;
        if (o instanceof  Student) {
            Student student = (Student) o;
            result = group.compareTo(student.group);
        }
        if (result == 0) {
            return super.compareTo(o);
        } else {
            return result;
        }
    }
}
