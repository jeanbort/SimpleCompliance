package com.emvista.simplegauge.spark.controller;

import spark.Request;
import spark.Response;
import spark.Route;

import java.util.HashMap;
import java.util.Map;

public class SparkApiController {
    private static String PARAMETER_NAME = "name";

    public static Route mainPage = (Request request, Response response) -> {
        if (request.queryParams(PARAMETER_NAME) !=null && !request.queryParams(PARAMETER_NAME).isEmpty())
            return "Hello " + request.queryParams(PARAMETER_NAME);
        return "Hello World!";
    };

}
