package tv.codely.mooc.student.infraestructure;

import org.junit.jupiter.api.Test;
import tv.codely.mooc.student.domain.*;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryStudentRepositoryTest {

    private final InMemoryStudentRepository repository = new InMemoryStudentRepository();

    @Test
    void save_a_valid_student() {
        Student student = StudentMother.random();

        repository.save(student);
    }

    @Test
    void search_a_existing_student() {
        Student student = StudentMother.random();

        repository.save(student);

        assertEquals(Optional.of(student), repository.search(student.id()));
    }

    @Test
    void not_fin_a_non_existing_student() {
        assertFalse(repository.search(StudentIdMother.random()).isPresent());
    }
}
