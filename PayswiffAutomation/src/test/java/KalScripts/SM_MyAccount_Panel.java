package KalScripts;

/*
 * @author Sai G
 * 
 */
import org.openqa.selenium.By;

public class SM_MyAccount_Panel {

	    //My Account Slider
		public static By SM_MyAccountSlider = By.xpath(".//*[@id='myAccountSlider']/a");
		
		//Profile
		public static By SM_Profile = By.xpath(".//*[@id='page-wrapper']/div[3]/div/div/div/div/ul/li[1]/a");
		
		//My Account Header
		public static By SM_MyAccHeader = By.xpath(".//*[@id='page-wrapper']/div[2]/div[1]/h2");

		//Profile Tab
		public static By M_MerchHeader = By.xpath(".//*[@id='page-wrapper']/div[3]/div/div/div/div/ul/li[1]/a");
		
		//Change Password
		public static By SM_ChangePwd = By.xpath(".//*[@id='page-wrapper']/div[3]/div/div/div/div/ul/li[2]/a");
		
		//Partner Configuration
		public static By SM_PartConfig = By.xpath(".//*[@id='page-wrapper']/div[3]/div/div/div/div/ul/li[3]/a");
		
		//User Details
				public static By SM_Profile_userdetails = By.xpath("//*[@id=\"profile\"]/div/div/h4");
				
				//Change password 
				public static By SM_Profile_changepassword = By.xpath("//*[@id=\"settings\"]/div/div/h4");
				
				//Current password 
				public static By SM_Profile_currentpassword = By.xpath("//*[@id=\"chPasswordForm\"]/div[1]/label");
				
				//New password 
				public static By SM_Profile_newpassword = By.xpath("//*[@id=\"chPasswordForm\"]/div[2]/label");
				
				//Confirm password 
				public static By SM_Profile_confirmpassword = By.xpath("//*[@id=\"chPasswordForm\"]/div[3]/label");
				
				
				
				//Notes
				public static By SM_Notes = By.xpath("//*[@id=\"chPasswordForm\"]/table/tbody/tr[2]/td/span[2]");
		
}