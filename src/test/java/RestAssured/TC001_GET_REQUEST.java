package RestAssured;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC001_GET_REQUEST {

    @Test
    void getWeatherDetails() {
        RestAssured.baseURI = "https://reqres.in/api/users";

        //creating request object
        RequestSpecification httprequest = RestAssured.given();

        //creating response object
        Response response = httprequest.request(Method.GET,"/2");
        String httpresponse=response.getBody().asString();
        String contenttype=response.getContentType();

        int statusCode=response.getStatusCode();
        String statusLine=response.getStatusLine();

        System.out.println("status code is "+statusCode);
        System.out.println("Status line is "+statusLine);

        Assert.assertEquals(statusCode,200);
        Assert.assertEquals(statusLine,"HTTP/1.1 200 OK");
        //PreemptiveBasicAuthScheme auth=new PreemptiveBasicAuthScheme();



    }



}
