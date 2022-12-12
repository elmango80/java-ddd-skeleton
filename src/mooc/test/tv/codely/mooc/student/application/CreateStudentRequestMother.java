package tv.codely.mooc.student.application;

import tv.codely.mooc.student.domain.*;

public final class CreateStudentRequestMother {

    public static CreateStudentRequest random() {
        return create(
            StudentIdMother.random(),
            StudentNameMother.random(),
            StudentEmailMother.random()
        );
    }

    private static CreateStudentRequest create(StudentId id, StudentName name, StudentEmail email) {
        return new CreateStudentRequest(id.value(), name.value(), email.value());
    }
}
