package RestAssured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class Linkedin_JavaRestAssuredTraining {


    @Test
    public void getUser()
    {
       String endpoint="https://reqres.in/api/users";
       var response=given().
               queryParam("page",2).
               when().
               get(endpoint).then().assertThat().body("per_page",equalTo(6));
        response.log().body();

    }
@Test
    public void createUser()
    {
        String endpoint="https://reqres.in/api/users";
        userClass_POST body=new userClass_POST("Cristiano Ronaldo","Footballer");

       var response= given().body(body).
                when().
                post(endpoint).
                then();
       response.log().body();
       response.statusCode(201);
    

    }






}
