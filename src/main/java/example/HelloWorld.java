package main.java.example;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created with IntelliJ IDEA.
 * User: prasanth
 * Date: 06/10/2012
 * Time: 23:17
 * To change this template use File | Settings | File Templates.
 */
@WebService()
public class HelloWorld {
  @WebMethod
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }
  public static void main(String[] argv) {

      //Wont do anything simply kept this file
//    Object implementor = new HelloWorld ();
//    String address = "http://localhost:9000/HelloWorld";
//    Endpoint.publish(address, implementor);
  }
}