import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class Phonebook {
	
	@Test
	public void phonebook()
	{
		RestAssured.baseURI="https://app.callhub.io";
		
		 given().header("Authorization", "Token 071fcafb417e7096433bbee4854a16ae6ae8435c").
		 
		 body(("{\"name\":\"api_phonbook\", \"description\":\"this is created through api\"}")).
		 when().post("/v1/phonebooks/").then().statusCode(200).and().contentType(ContentType.JSON);

	}
	
	 @Test
	 public void voicebroadcasts()
	 {
		 RestAssured.baseURI="https://app.callhub.io";
			
		 given().header("Authorization", "Token 071fcafb417e7096433bbee4854a16ae6ae8435c").
		 
		 body("{"+
		 		"           	\"contact\": \"9437402007\",\r\n" + 
		 		"  \"mobile\": \"9437402007\",\r\n" + 
		 		"  \"last_name\": \"Himansu\",\r\n" + 
		 		"  \"first_name\": \"Chris\",\r\n" + 
		 		"  \"country_code\": \"US\",\r\n" + 
		 		"  \"email\": \"himansuy@gmail.com\",\r\n" + 
		 		"  \"address\": \"34785 Longboat \",\r\n" + 
		 		"  \"city\": \"Portland\",\r\n" + 
		 		"  \"state\": \"OR\",\r\n" + 
		 		"  \"company_name\": \"Honeywell\",\r\n" + 
		 		"  \"company_website\": \"https://www.ibm.in\",\r\n" + 
		 		"  \"job_title\": \"Qa Engineer\""+
		 		"        },").
		 
		when().post("/v1/phonebooks/2034820981746304759/create_contact/").then().
		statusCode(200).and().contentType(ContentType.JSON).extract().response();
		
		
	 }

}
