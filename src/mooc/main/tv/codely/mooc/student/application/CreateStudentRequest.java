package tv.codely.mooc.student.application;

import java.util.Objects;

public class CreateStudentRequest {
    private final String id;
    private final String name;
    private final String email;

    public CreateStudentRequest(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String id() {
        return id;
    }

    public String name() {
        return name;
    }

    public String email() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateStudentRequest course = (CreateStudentRequest) o;
        return id.equals(course.id) &&
            name.equals(course.name) &&
            email.equals(course.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
    }
}
