package rest;

import feign.Param;
import feign.RequestLine;
import model.NumberResource;

public interface NumberClient {
    @RequestLine("GET /service/{client}/number")
    NumberResource getPoints(@Param("client") String client);
}
