package com.org.learmaven;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.SystemClock;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import com.org.learmaven.LoginPage;
import java.util.concurrent.TimeUnit;

import com.codoid.products.exception.FilloException;
import com.org.learmaven.FILLOAPP;

/**
 * Created by ovidiu.zakarias on 13.03.2017.
 */
public class ApplyAsDeveloperTest {

WebDriver driver;
    static ExtentReports report;
    ExtentTest test;
    
   // public void BaseTest(){
    	//reports = new ExtentReports("\\Reports\\Report.html");
  //  }

    @BeforeClass public static void allTestsPrep(){
    	
    	report  = new ExtentReports("Report.html",true);
    }
    
    @AfterClass public static void allTestCleanUp()
	{
		report.flush();
	}
   // @Before
   // public void setup() {
        //use Chrome Driver
        //System.setProperty("webdriver.chrome.driver", (System.getProperty("user.dir") + "/src/main/resources/chromedriver"));
       // driver = new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   // }

    @Test
    public void applyAsDeveloper() throws FilloException {
        //Create object of HomePage Class
    	test = report.startTest("Testcase 1 - Test about you page");
    	driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	LoginPage lp = new LoginPage(driver);
    	//FILLOAPP app = new FILLOAPP();
    	//lp.un("TC001");
    	FILLOAPP.inputText(lp.UseName_ED, "UserName_ED");
    	FILLOAPP.inputText(lp.Pasword_ED, "Pard_ED");
    	
    	
    	test.log(LogStatus.PASS, "VERIFIED");
    	//app.inputText(UseName_ED, UserName_ED, TCID);
    	
    	//HomePage homepage = new HomePage(driver);
       // homepage.clickOnDeveloperApplyButton();
       // test.log(LogStatus.INFO, "Browser started");
        //Create object of DeveloperPortalPage
      //  DeveloperPortalPage developerPortalPage = new DeveloperPortalPage(driver);

        //Check if page is opened
       // Assert.assertTrue(developerPortalPage.isPageOpened());

        //Click on Join Toptal
       // developerPortalPage.clickOnJoin();

        //Create object of DeveloperApplyPage
       /** DeveloperApplyPage developerApplyPage = new DeveloperApplyPage(driver);

        //Check if page is opened
        Assert.assertTrue(developerApplyPage.isPageOpened());

        //Fill up form
        developerApplyPage.setDeveloper_email("ovidiu.zakarias@pitechnologies.ro");
        developerApplyPage.setDeveloper_full_name("Ovidiu Zakarias");
        developerApplyPage.setDeveloper_password("quality1");
        developerApplyPage.setDeveloper_password_confirmation("quality1");
        developerApplyPage.setDeveloper_skype("ovidiu.zakarias");
        test.log(LogStatus.PASS, "VERIFIED");
        //Click on join
       // developerApplyPage.clickOnJoin();**/
    }

    @After
    public void close() { 
    //driver.close(); 
    test = null;}

}
