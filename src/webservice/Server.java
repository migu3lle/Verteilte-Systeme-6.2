package webservice;

import javax.xml.ws.Endpoint;

public class Server {
    public static void main(String[] args) {
        String url = "http://localhost:6969/webservice";
        Endpoint.publish(url, new CalculatorImpl() );
        System.out.println("Endpoint active...");
    }
}
