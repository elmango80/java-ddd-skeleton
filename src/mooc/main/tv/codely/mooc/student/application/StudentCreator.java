package tv.codely.mooc.student.application;

import tv.codely.mooc.student.domain.*;
import tv.codely.shared.domain.Service;

@Service

public final class StudentCreator {
    private final StudentRepository repository;

    public StudentCreator(StudentRepository repository) {
        this.repository = repository;
    }

    public void create(CreateStudentRequest request) {
        StudentId studentId = new StudentId(request.id());
        StudentName studentName = new StudentName(request.name());
        StudentEmail studentEmail = new StudentEmail(request.email());
        Student student = new Student(studentId, studentName, studentEmail);

        repository.save(student);
    }
}
