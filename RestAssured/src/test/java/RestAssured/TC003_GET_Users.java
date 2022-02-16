package RestAssured;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class TC003_GET_Users {

    @Test(priority = 1)
    public void get_Users() {
        given()
                .when()
                    .get("https://reqres.in/api/users/2")

                .then()
                    .log().body()
                    .statusCode(201);
    }

@Test(dataProvider = "userdata",priority = 2)
    public void create_User(String uname,String ujob)
    {
        HashMap<Object,Object> userData=new HashMap<>();

        userData.put("name",uname);
        userData.put("job",ujob);

        Response res =
        given()
                .contentType("application/json")
                .body(userData)

                    .when()
                        .post("https://reqres.in/api/users")

                    .then()
                         .log().body()
                        .statusCode(201)
                        .extract().response();

        String jsonString=res.asString();

        Assert.assertEquals(jsonString.contains("id"),true);


    }

    @DataProvider(name="userdata")
    Object[][] getUserData()
    {
        Object data [][]={{"Xeeshan","QA"},{"Cristiano","Dev"},{"Messi","Automation"}};
        return data;

    }

}
