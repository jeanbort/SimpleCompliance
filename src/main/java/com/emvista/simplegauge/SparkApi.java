package com.emvista.simplegauge;

import com.emvista.simplegauge.spark.controller.SparkApiController;

import static spark.Spark.get;

public class SparkApi {

    public static void main(String[] args) {
        get("/main", SparkApiController.mainPage);
    }
}
