package com.emvista.simplecompliance;

import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockserver.integration.ClientAndServer;

import static io.restassured.RestAssured.given;
import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;
import static org.mockserver.integration.ClientAndServer.startClientAndServer;


class ExternalApiTest {

    private static ClientAndServer mockServer;

    @BeforeAll
    public static void startMockServer() {
        mockServer = startClientAndServer(4545);
        mockServer.when(
            request().withPath("/rest/")

        ).respond(
                response().withStatusCode(200)
        );
    }

    @AfterAll
    public static void stopMockServer() {
        mockServer.stop();
    }

    @BeforeEach
    public void setup() {
        RestAssured.basePath = "/";
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 4545;
    }

    @Test
    void basicPingTest() {
        given().when().get("/rest/").then().statusCode(200);
    }

}
