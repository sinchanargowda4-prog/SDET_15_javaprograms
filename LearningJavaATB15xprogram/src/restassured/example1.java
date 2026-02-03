package restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class example1 {
    String payload = "{\"title\": \"foo\", \"body\": \"bar\", \"userId\": 1}";

    @Test
    public void postRequest() {
        RestAssured.given()
            .baseUri("https://jsonplaceholder.typicode.com")
            .basePath("/posts")
            .contentType(ContentType.JSON)
            .body(payload)
        .when()
            .post()
        .then()
            .log().all()
            .statusCode(201);
    }

}