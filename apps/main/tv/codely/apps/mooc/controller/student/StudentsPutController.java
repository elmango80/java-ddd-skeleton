package tv.codely.mooc.controller.student;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tv.codely.mooc.student.application.CreateStudentRequest;
import tv.codely.mooc.student.application.StudentCreator;

@RestController
public final class StudentsPutController {
    private final StudentCreator creator;

    public StudentsPutController(StudentCreator creator) {
        this.creator = creator;
    }

    @PutMapping(value = "/students/{id}")
    public ResponseEntity<String> index(@PathVariable String id, @RequestBody Request request) {
        CreateStudentRequest createStudentRequest = new CreateStudentRequest(
            id, request.name(), request.email());

        creator.create(createStudentRequest);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}

final class Request {
    private final String name;
    private final String email;

    Request(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String name() {
        return name;
    }

    public String email() {
        return email;
    }
}
