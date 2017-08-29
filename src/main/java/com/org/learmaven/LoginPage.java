package com.org.learmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codoid.products.exception.FilloException;

public class LoginPage {
	
	public WebDriver driver;
	private static String PAGE_URL = "https://www.facebook.com/login/";
	@FindBy(name="email")
    public WebElement UseName_ED;

    @FindBy(name="pass")
    public WebElement Pasword_ED;

    @FindBy(id="loginbutton")
    public WebElement Login_BT;

    
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        driver.get(PAGE_URL);
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

   // public void un(String TCID) throws FilloException{
    	//FILLOAPP.inputText(UseName_ED, "UserName_ED");
    //}
    

   // public void pg_ValidLogin(String TCID) throws FilloException {
        /*UI.fn_Input(UserName_ED, "UserName_ED");
        UI.fn_Input(Password_ED, "Password_ED");
        UI.fn_Click(Login_BT);*/

        //UserName_ED.sendKeys("abc");

    	//System.out.println(TCID);
        //TestingFillo.inputText(UseName_ED, "UserName_ED", TCID);
        //TestingFillo.inputText(Pasword_ED, "Pard_ED", TCID);
       // Login_BT.click();


       // HomePage hpObj=PageFactory.initElements(UI.driver, HomePage.class);
       // return hpObj;
 //   }

   // public void pg_InValidLogin() {
    //    UseName_ED.sendKeys("rahul");
      //  Pasword_ED.sendKeys("admin");
      //  Login_BT.click();
 //   }
}
