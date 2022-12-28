package steps;

import utils.Config; 
import utils.RestSteps;

public class PassengerEndpoint extends RestSteps{

	final String ENDPOINT = "/v1/passenger";
	
	Config Config = new Config();
	
	public PassengerEndpoint() {
		setBaseUrl(Config.get("baseUrl"));
	}
	
	public void getPassenger() {
		sentAsGet(ENDPOINT);
	}
	
	public void statusCodeValidation() {
		getResponse().then().statusCode(200);
	}
	
}	
