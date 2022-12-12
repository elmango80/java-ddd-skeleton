package tv.codely.mooc.student.domain;

import java.util.Objects;

public class Student {
    private final StudentId id;
    private final StudentName name;
    private final StudentEmail email;

    public Student(StudentId id, StudentName name, StudentEmail email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public StudentId id() {
        return id;
    }

    public StudentName name() {
        return name;
    }

    public StudentEmail email() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
    }
}
