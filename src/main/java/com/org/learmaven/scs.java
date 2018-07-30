package com.org.learmaven;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class scs {
	
	Screenshot screenshot;
	static WebDriver driver;
	
	public void ss (String fsname) throws IOException, InterruptedException{
		String scp ="E:\\Projectoutputs\\Screenshots\\";
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(scp+fsname+".png"));
		Thread.sleep(5000);
		
	}
	public void fs (String ssname) throws IOException, InterruptedException{
		String scp ="E:\\Projectoutputs\\Screenshots\\";
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(screenshot.getImage(),"PNG",new File(scp+ssname+".png"));
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(scp+ssname+".png"));
		Thread.sleep(5000);
	}
}
