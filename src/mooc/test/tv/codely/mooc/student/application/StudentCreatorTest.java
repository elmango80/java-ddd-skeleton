package tv.codely.mooc.student.application;

import org.junit.jupiter.api.Test;
import tv.codely.mooc.student.domain.*;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

final class StudentCreatorTest {

    @Test
    void save_a_valid_student() {
        StudentRepository repository = mock(StudentRepository.class);
        StudentCreator creator = new StudentCreator(repository);
        CreateStudentRequest request = CreateStudentRequestMother.random();
        Student student = StudentMother.fromRequest(request);

        creator.create(request);

        verify(repository, atLeastOnce()).save(student);
    }
}
