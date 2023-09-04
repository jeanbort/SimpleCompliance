package com.emvista.simplecompliance;

import com.emvista.simplecompliance.spark.controller.SparkApiController;

import static spark.Spark.get;

public class SimpleCompliance {

    public static void main(String[] args) {
        get("/main", SparkApiController.mainPage);
    }
}
