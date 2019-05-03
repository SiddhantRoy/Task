import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class FirstTAsk {
	
	
	@Test
	public  void Task() {
				
RestAssured.baseURI="https://app.callhub.io";
		
		 given().header("Authorization", "Token 071fcafb417e7096433bbee4854a16ae6ae8435c").
		when().get("/v1/contacts").then().
		assertThat().statusCode(200).and().contentType(ContentType.JSON);
		
	}
		 @Test
		 public void voicebroadcasts()
		 {
			 RestAssured.baseURI="https://app.callhub.io";
				
			 given().header("Authorization", "Token 071fcafb417e7096433bbee4854a16ae6ae8435c").
			when().get("/v1/voice_broadcasts").then().
			assertThat().statusCode(200).and().contentType(ContentType.JSON);
			 
		 }
		
	}

