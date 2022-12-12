package tv.codely.mooc.student.domain;

import tv.codely.shared.domain.NameMother;

public final class StudentNameMother {
    public static StudentName create(String value) {
        return new StudentName(value);
    }

    public static StudentName random() {
        return create(NameMother.random());
    }
}
