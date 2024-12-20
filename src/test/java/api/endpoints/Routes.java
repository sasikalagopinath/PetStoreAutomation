package api.endpoints;

//contains uRL's

//only maintain URL's

//Swagger URI - https://petstore.swagger.io/

//Create user - https://petstore.swagger.io/v2/user
//Get user - https://petstore.swagger.io/v2/user/{username}
//update user - https://petstore.swagger.io/v2/user/{username}
//delete user - https://petstore.swagger.io/v2/user/{username}

public class Routes {
	
	public static String base_url = "https://petstore.swagger.io/v2";
	
	//User Module
	
	public static String post_url=base_url+"/user";
	public static String get_url=base_url+"/user/{username}";
	public static String update_url=base_url+"/user/{username}";
	public static String delete_url=base_url+"/user/{username}";
}
