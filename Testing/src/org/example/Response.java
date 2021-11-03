package org.example;// Library for org.example.Response class

import java.util.List;

/**
 * Khoro Library org.example.Response Class
 * POJO class pure old java object
 */
public class Response {
    // camel case
    int httpStatusCode;
    String status;
    List<String> reslut;

    Response(int httpStatusCode, String status) {
        this.httpStatusCode = httpStatusCode;
        this.status = status;
    }

    Response(int httpStatusCode, List<String> reslut) {
        this.httpStatusCode = httpStatusCode;
        this.reslut = reslut;
    }
}
