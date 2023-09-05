package com.emvista.simplecompliance;

import com.emvista.simplecompliance.controller.SimpleComplianceController;
import com.thoughtworks.gauge.*;
import com.thoughtworks.gauge.datastore.ScenarioDataStore;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import spark.Spark;


import static io.restassured.RestAssured.given;

public class SimpleComplianceControllerTest {

    @BeforeSuite
    public void beforeSuite() {
        Spark.port(4567);
        Spark.get("/main", SimpleComplianceController.mainPage);
        Spark.init();
    }

    @AfterSuite
    public void afterSuite() {
        Spark.stop();
    }

    @Step("get main endpoint <apiendpoint>")
    public void callController(String apiendpoint) {
        Response response = given().get(System.getenv(apiendpoint));
        ScenarioDataStore.put(apiendpoint, response);
    }

    @Step("get main endpoint <apiendpoint> with parameter in <table>")
    public void callControllerWithParameter(String apiendpoint, Table table) {
        Response response = given().get(System.getenv(apiendpoint) + "?name=" + table.getColumnValues("parameter").get(0));
        ScenarioDataStore.put(apiendpoint, response);
    }

    @Step("then the status of <apiendpoint> equals <code>")
    public void getStatusCode(String apiendpoint, String code) {
        Response response = (Response) ScenarioDataStore.get(apiendpoint);
        Assertions.assertEquals(Integer.parseInt(code), response.statusCode());
    }

    @Step("then the content of <apiendpoint> equals <content>")
    public void getContent(String apiendpoint, String content) {
        Response response = (Response) ScenarioDataStore.get(apiendpoint);
        Assertions.assertEquals(content, response.print());
    }

}
