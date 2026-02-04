package testng_1;

import org.testng.annotations.Test;

/*
 * 1) open app
 * 2) loin to tat app
 * 3)logout
 * 
 */
public class testcase1 
{    @Test(priority=1)
    void openapp() 
    {
       System.out.println("opening application----");
    }


	@Test(priority=2)
    void login() 
    {
        System.out.println("login to the application----");		
    }
	
	
    @Test(priority=3)
    void logout() 
    {
        System.out.println("logout fron application----");	
    }
}
