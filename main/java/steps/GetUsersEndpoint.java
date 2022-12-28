package steps;

import java.util.HashMap;
import java.util.Map;

import utils.Config;

import utils.RestSteps;

public class GetUsersEndpoint extends RestSteps{
	

	final String ENDPOINT = "/api/users";
	Map<String, Object>map = new HashMap<String, Object>();
	Config readConfig = new Config();
	
	public  void GetUsersEnpoint() {
		setBaseUrl(Config.get("reqResbaseUrl"));
	}
	
	public void getUsers() {
		map.put("page", 2);
		sentAsGet(ENDPOINT, map);
	}
	
	public void statusCodeValidation() {
		getResponse().then().statusCode(200);
	}
}
	




