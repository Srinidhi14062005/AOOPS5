package com.student.imformation;

public class EnrollmentService implements IEnrollmentService {
    @Override
    public void enrollStudentInCourse(IStudent student, ICourse course) {
        student.enrollInCourse(course);
        course.enrollStudent(student);
    }
}


