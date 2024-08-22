package com.student.imformation;

import java.util.List;

public interface ICourse {
	String getId();
    String getName();
    void enrollStudent(IStudent student);
    List<IStudent> getEnrolledStudents();
}
