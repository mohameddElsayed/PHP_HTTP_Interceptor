package getRequest;

//import static com.jayway.restassured.RestAssured.given;
import static junit.framework.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.apache.commons.collections4.Get;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.internal.RequestSpecificationImpl;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetData {
	
	String Api = "https://samples.openweathermap.org/data/2.5/weather?q=London," 
	+"uk&appid=b6907d289e10d714a6e88b30761fae22 ";

	@Test
	public void GetTravelDetails()
	{
		
		// Spcify base URL
		RestAssured.baseURI="https://www.phptravels.net/ register";
		
		//Request Object
		RequestSpecification httpRequest= RestAssured.given();
		
		
		//Response Object 
		Response response = httpRequest.request(Method.GET,"");
		
		//Request sending along with post request 
		JSONObject RequestData = new JSONObject();
		
		RequestData.put("firstname", "Nader");
		RequestData.put("lastname", "Ahmed");
		RequestData.put("phone", "01124984247");
		RequestData.put("email", "mohamed.els.ab@dxc.com");
		RequestData.put("Password", "Mohamed@1_2");
		RequestData.put("ConfirmationPassword", "Mohamed@1_2");
		
		
		
		httpRequest.headers( "content-type", "applicatio/json");
		httpRequest.body(RequestData.toJSONString());
		
		
		
		// Print response in console window
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is :"+ responseBody);
		
		// Status code Validation
		int StatusCode = response.getStatusCode();
		System.out.println("Status code is :" + StatusCode);
		Assert.assertEquals(StatusCode, 200);
		
		
		// Status line Verification
		String StatusLine = response.getStatusLine();
		System.out.println("Status Line is :" + StatusLine);
		Assert.assertEquals(StatusLine, "Http/1.1 200 ok");
		
		
//		  @Test (priority = 1)
//		    public void getBookings() {
//		         responseOfBookingsApi = given()
//		                .when()
//		                .get("https://www.phptravels.net/ register")
//		                .then()
//		                .extract()
//		                .response();
//		         sizeOfList = responseOfBookingsApi.body().path("bookings.size()");
//
//		      assertTrue(sizeOfList < 2) ;
//		    }
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
//	@Test 
//	public  void TestResponseCode()
//	{
//		
//		
//		int code = get(Api).getStatusCode();
//		System.out.println("Code :"+ code);
//		Assert.assertEquals(code, 200);
//		
//		
//}
//	
//	@Test
//    public void body()
//    {
//		long time = get().getTime();
//		System.out.println("Response Time :"+ time);
//
//}
}


