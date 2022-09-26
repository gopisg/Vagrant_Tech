package com.listener;

import java.io.File;

import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.pom.WikiPushpaPage;

public class ListenerTest implements ITestListener {

	
	 public void onTestFailure(ITestResult Result) 					
	    {		
	   
		 
		 System.out.println("The name of the testcase failed is :"+Result.getName());
	   WikiPushpaPage wp=new WikiPushpaPage();
	    try {
			WikiPushpaPage.takescreenshot(wp.getReleaseDate());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    }
	
}
