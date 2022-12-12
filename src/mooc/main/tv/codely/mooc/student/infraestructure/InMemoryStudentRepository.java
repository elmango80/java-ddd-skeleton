package tv.codely.mooc.student.infraestructure;

import tv.codely.mooc.student.domain.Student;
import tv.codely.mooc.student.domain.StudentId;
import tv.codely.mooc.student.domain.StudentRepository;
import tv.codely.shared.domain.Service;

import java.util.HashMap;
import java.util.Optional;

@Service
public class InMemoryStudentRepository implements StudentRepository {
    private final HashMap<String, Student> students = new HashMap<>();

    @Override
    public void save(Student student) {
        this.students.put(student.id().value(), student);
    }

    @Override
    public Optional<Student> search(StudentId id) {
        return Optional.ofNullable(students.get(id.value()));
    }
}
