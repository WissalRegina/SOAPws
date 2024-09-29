package serverJWS;

import WSpackage.BanqueService;
import jakarta.xml.ws.Endpoint;

public class MyServerJWS {

    public static void main(String[] args) {
        String url = "http://0.0.0.0:9191/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("web service statrted at : http://0.0.0.0:9191/ ");
    }
}
