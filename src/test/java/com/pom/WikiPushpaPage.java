package com.pom;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assesment1.Vagrant;

public class WikiPushpaPage extends Vagrant {
public WikiPushpaPage() {
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//div[text()='Release date']/parent::th/following-sibling::td")
private WebElement releaseDate;

@FindBy(xpath="//th[text()='Country']/following-sibling::td")
private WebElement countryOfOrgin;

public WebElement getReleaseDate() {
	return releaseDate;
}

public WebElement getCountryOfOrgin() {
	return countryOfOrgin;
}

public static void takescreenshot(WebElement ele) throws Throwable {
	 
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", ele);
	Thread.sleep(2000);
	js.executeScript("arguments[0].style.border='2px solid red'", ele);
	File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	    java.awt.image.BufferedImage  fullImg = ImageIO.read(screenshot);
//
//	    // Get the location of element on the page
//	    org.openqa.selenium.Point point = ele.getLocation();
//
//	    // Get width and height of the element
//	    int eleWidth = ele.getSize().getWidth();
//	    int eleHeight = ele.getSize().getHeight();
//
//	    // Crop the entire page screenshot to get only element screenshot
//	    java.awt.image.BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(),
//	        eleWidth, eleHeight);
//	    ImageIO.write(eleScreenshot, "png", screenshot);
	    FileUtils.copyFile(screenshot, new File("C:\\Users\\user\\eclipse-workspace\\new\\VagrantTest\\Screenshots\\wiki.png"));

}
}
