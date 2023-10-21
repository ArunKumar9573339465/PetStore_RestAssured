package api.endpoints;

import static io.restassured.RestAssured.given;

import com.github.scribejava.core.model.Response;

import io.restassured.http.ContentType;



public class UserCRUD {

	public static Response createUser(User payload) {
		Response response=given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(payload)
		
		.when()
			.post(URI.post_url);
		
		return response;
	}

	public static Response readUser(String username) {
		Response response= (Response) given()
				.pathParams("userName", username)
				
				.when()
				.get(URI.get_url);
		
		return response;
	}
	
	public static Response updateUser(String username,User payload) {
		Response response=given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.pathParam("userName", username)
		.body(payload)
		
		.when()
			.put(URI.update_url);
		
		return response;
	}
	
	public static Response deletUser(String username) {
		Response response= (Response) given()
				.pathParams("userName", username)
				
				.when()
				.delete(URI.delete_url);
		
		return response;
	}
	
	
	
	
	
	
	
	
	
	
	
}
