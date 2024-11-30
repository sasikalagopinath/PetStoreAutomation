package api.endpoints;
import static io.restassured.RestAssured.*;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

//created for perform CRUD methods implementation - Create, read, update and delete requests the user API.

public class UserEndPoints {
	
	//implemetation of endpoints
	
	public static Response createUser(User payload) {
		Response respose = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)
		
			.when()
				.post(Routes.post_url);
		
		return respose;
			
	}
	
	public static Response readUser(String uerName) {
		Response respose = given()
						.pathParam("username", uerName)
		
						.when()
						.get(Routes.get_url);
		return respose;
			
	}
	
	public static Response updateUser(String uerName, User payload) {
		Response respose = given()
						.contentType(ContentType.JSON)
						.accept(ContentType.JSON)
						.pathParam("username", uerName)
						.body(payload)
	
						.when()
						.put(Routes.update_url);
		return respose;
			
	}
	
	public static Response deleteUser(String uerName) {
		Response respose = given()
						.pathParam("username", uerName)
						.when()
						.delete(Routes.delete_url);
		return respose;
			
	}
}
