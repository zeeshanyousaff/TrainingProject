package RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC002_POST_Request {

@Test
    void registerUser()
    {
        RestAssured.baseURI="https://reqres.in/api";

        RequestSpecification httprequest=RestAssured.given();

        JSONObject requestparams=new JSONObject();

        requestparams.put("name","Xee");
        requestparams.put("job","QA");

        httprequest.header("Content-Type","application/json");

        httprequest.body(requestparams.toJSONString()); //attach above data to request body

        Response response=httprequest.request(Method.POST,"/users");

        String responsebody=response.getBody().asString();
        System.out.println(responsebody);
        System.out.println(response.getStatusCode());
        String nameField=response.jsonPath().get("name");
        Assert.assertEquals(nameField,"Xee");

    }

}
