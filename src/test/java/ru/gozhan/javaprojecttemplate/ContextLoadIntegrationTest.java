package ru.gozhan.javaprojecttemplate;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import ru.gozhan.javaprojecttemplate.config.Endpoint;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class ContextLoadIntegrationTest extends AbstractIntegrationTest {

    @Test
    @DisplayName("Test that context is loaded")
    void contextLoads() {
        given().spec(requestSpecification)
                .when()
                .get(Endpoint.HEALTH.getPath())
                .then()
                .statusCode(HttpStatus.OK.value())
                .contentType(ContentType.JSON)
                .body("status", equalTo("UP"));
    }

}
