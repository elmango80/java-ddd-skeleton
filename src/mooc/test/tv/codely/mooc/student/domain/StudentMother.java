package tv.codely.mooc.student.domain;

import tv.codely.mooc.student.application.CreateStudentRequest;

public final class StudentMother {
    private static Student create(StudentId id, StudentName name, StudentEmail email) {
        return new Student(id, name, email);
    }

    public static Student fromRequest(CreateStudentRequest request) {
        return create(
            StudentIdMother.create(request.id()),
            StudentNameMother.create(request.name()),
            StudentEmailMother.create(request.email())
        );
    }

    public static Student random() {
        return create(
            StudentIdMother.random(),
            StudentNameMother.random(),
            StudentEmailMother.random()
        );
    }
}
