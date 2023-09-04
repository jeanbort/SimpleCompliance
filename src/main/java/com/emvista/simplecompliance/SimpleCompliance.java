package com.emvista.simplecompliance;

import com.emvista.simplecompliance.controller.SimpleComplianceController;

import static spark.Spark.get;

public class SimpleCompliance {

    public static void main(String[] args) {
        get("/main", SimpleComplianceController.mainPage);
    }
}
