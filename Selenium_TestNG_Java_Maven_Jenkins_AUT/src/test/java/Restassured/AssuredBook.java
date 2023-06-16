package Restassured;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

    public class AssuredBook {
        @Test
        public void GetBooksDetails() {


            //RestAssured.baseURI = "http://computer-database.gatling.io/computers";
            RestAssured.baseURI = "https://bookstore.toolsqa.com/BookStore/v1/Books";



            RequestSpecification httpRequest = RestAssured.given();

            // specify the method type (GET) and the parameters if any.
            //In this case the request does not take any parameters
            Response response = httpRequest.request(Method.GET, "");

            // Print the status and message body of the response received from the server
            System.out.println("Status received => " + response.getStatusLine());
            System.out.println("Response=>" + response.prettyPrint());

        }
    }


