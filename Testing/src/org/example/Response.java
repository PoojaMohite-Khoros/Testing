package org.example;// Library for org.example.Response class

import java.util.List;
import java.util.Objects;

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

    public Response(int httpStatusCode, List<String> reslut) {
        this.httpStatusCode = httpStatusCode;
        this.reslut = reslut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Response response = (Response) o;
        return httpStatusCode == response.httpStatusCode && Objects.equals(status, response.status) && Objects.equals(reslut, response.reslut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(httpStatusCode, status, reslut);
    }

    @Override
    public String toString() {
        return "Response{" +
                "httpStatusCode=" + httpStatusCode +
                ", status='" + status + '\'' +
                ", reslut=" + reslut +
                '}';
    }
}
