package com.student.imformation;

import java.util.ArrayList;
import java.util.List;

public class Student implements IStudent {
    private String id;
    private String name;
    private List<ICourse> enrolledCourses = new ArrayList<>();

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void enrollInCourse(ICourse course) {
        enrolledCourses.add(course);
    }
}
