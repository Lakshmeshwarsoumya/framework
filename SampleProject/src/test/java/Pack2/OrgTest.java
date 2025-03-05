package Pack2;

import org.testng.annotations.Test;

public class OrgTest {
	@Test
	public void createOrgTest() {

		System.out.println("execute createOrgtest");
		String URL = System.getProperty("url");
		String Browser = System.getProperty("browser","Chrome");
		String Username = System.getProperty("username");
		String Password = System.getProperty("Password");

		System.out.println("execute createcontacttest");
		System.out.println(URL);
		System.out.println(Browser);
		System.out.println(Username);
		System.out.println(Password);
	}

	@Test
	public void modifyOrgTest() {

		System.out.println("execute modifyOrgtest");
	}

}
