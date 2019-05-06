package webservice;

import wscalc.ws.WsCalcImpl;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Client {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //String url = "http://localhost:6969/webservice";
        String url = "http://143.205.194.75:8080/ws/wscalc";
        Service service = null;

        try {
            service = Service.create(
                    new URL(url + "?wsdl"),
                    new QName("http://ws.WsCalc", "WsCalcImplService"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        WsCalcImpl calculator = service.getPort(WsCalcImpl.class);

        //System.out.println("\n" + calculator.hallo("ich"));

        try {
            System.out.println("Surface Area of a Cylinder = 2*π*r2 + 2*π*r*h\nEnter radius:");
            double radius = Double.parseDouble(reader.readLine());
            System.out.println("Enter height:");
            double height = Double.parseDouble(reader.readLine());
            System.out.println("Cylinder surface area = " +
                    calculator.add(calculator.mul(calculator.mul(2, Math.PI), calculator.mul(radius, radius)),
                    calculator.mul(calculator.mul(calculator.mul(2, Math.PI), radius), height)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
