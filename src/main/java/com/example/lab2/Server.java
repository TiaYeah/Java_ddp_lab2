package com.example.lab2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

public class Server {
    public static final int port = 8080;

    public static void main(String[] args) {
        ServerController serverController = new ServerController();
        String url = String.format("http://localhost:%d/Server", port);
        Endpoint.publish(url, serverController);
    }

}
