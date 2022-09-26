package com.assesment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pom.MoviePage;
import com.pom.Resultpage;
import com.pom.Searchpage;
import com.pom.WikiPushpaPage;

import io.github.bonigarcia.wdm.WebDriverManager;


@Listeners(com.listener.ListenerTest.class)
public class Vagrant {

	
	String imdbReleasedate;
	String imdbCountryoforigin;
	String wikiReleasedate;
	String wikiCountryoforigin;
	public static WebDriver driver;
	@BeforeSuite
	public void launchDriver() {
	
		WebDriverManager.chromedriver().setup();
	}
	
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void launchApp() {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);		
		
	}
	@Test(priority = 0)
	public void checkPushpa() {
		driver.get("https://www.imdb.com/");
		Searchpage sp=new Searchpage();
		sp.getTxtSearch().sendKeys("The Pushpa"+Keys.ENTER);
		
		Resultpage rp=new Resultpage();
		
		rp.getTxtmoviename().click();
		
		MoviePage mp=new MoviePage();
		
		imdbReleasedate = mp.getReleasedate().getText();
	
 imdbCountryoforigin=mp.getCountryOforigin().getText();
	
		
	}
	
	@Test(priority = 1)
	public  void checkWiki() {
		driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
		WikiPushpaPage wp=new WikiPushpaPage();
		wikiReleasedate=wp.getReleaseDate().getText();
		wikiCountryoforigin=wp.getCountryOfOrgin().getText();

		Assert.assertEquals(imdbCountryoforigin, wikiCountryoforigin);
		Assert.assertEquals(wikiReleasedate,imdbReleasedate);
		
		
		
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
