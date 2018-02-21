package MavenProject.MavenTestProject;

import org.testng.annotations.Test;
import MavenProject.MavenTestProject.POMClass.*;
import MavenProject.MavenTestProject.BaseClass.*;


public class InvalidLogin extends BaseTest {

	@Test(priority=2,groups="login")
	public void testInvalidLogin(){
		String un=Excel.getCellValue(XL_PATH,"InvalidLogin",1,0);
		String pw=Excel.getCellValue(XL_PATH,"InvalidLogin",1,1);
		//Enter invalid user name
		LoginPage l=new LoginPage(driver);
		l.setUserName(un);
		//Enter invalid password
		l.setPassword(pw);
		//click on Login
		l.clickLogin();
		//verify that err msg is Displayed
		l.verifyErrMsgIsDisplayed(driver);
	}
}
