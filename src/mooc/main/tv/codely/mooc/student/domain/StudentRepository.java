package tv.codely.mooc.student.domain;

import java.util.Optional;

public interface StudentRepository {
    void save(Student student);
    Optional<Student> search(StudentId id);
}
