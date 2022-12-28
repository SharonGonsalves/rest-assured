package api.testscripts;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.GetUsersEndpoint;

public class GetUserTest {
	

	GetUsersEndpoint getUsers;
	
	@BeforeMethod
	public void init() {
		getUsers = new GetUsersEndpoint();
	}
	
	@Test
	public void getUsersTest() {
		getUsers.getUsers();
		getUsers.statusCodeValidation();
		getUsers.responseBodyValidation("data.last_name[2]", "Gonsalves");
		getUsers.responseBodyValidation("data.first_name[1]", "Sharon");
	}
}

