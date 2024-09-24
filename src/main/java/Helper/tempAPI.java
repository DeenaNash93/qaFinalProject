package Helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class tempAPI
{
    RequestSpecification httpRequest;
    Response response;
    String url ="http://localhost:9000/";


    @Test
    public void testingAPI()
    {
        RestAssured.baseURI=url;
        httpRequest=RestAssured.given();


        //Get Request
       // response=httpRequest.get("student/list");
      //  System.out.println(response.getBody().asString());

        //Post + Put Request
       //  JSONObject params= new JSONObject();
      //   params.put("firstName","Deena");
     //    params.put("lastName","Nash");
       //  params.put("email","deenanash933@gmail.com");
      //   params.put("programme","QA-Engineer");

     // httpRequest.header("Content-Type","application/json");
       //httpRequest.body(params.toJSONString());

    //  response=httpRequest.post("/student");
    //   response=httpRequest.delete("/student/101");

       // response.prettyPrint();
    }

}


