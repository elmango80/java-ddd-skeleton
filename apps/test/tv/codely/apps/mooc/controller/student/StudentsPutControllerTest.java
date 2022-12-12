package tv.codely.apps.mooc.controller.student;

import org.junit.jupiter.api.Test;
import tv.codely.apps.mooc.controller.RequestTestCase;

class StudentsPutControllerTest extends RequestTestCase {

    @Test
    void create_a_valid_non_existing_student() throws Exception {
        this.assertRequestWithBody(
            "PUT",
            "/students/1aab45ba-3c7a-4344-8936-78466eca77fb",
            "{\"name\": \"John Doe\", \"email\": \"john.doe@example.com\"}",
            201
        );
    }
}
