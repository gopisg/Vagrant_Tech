package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assesment1.Vagrant;

public class Resultpage extends Vagrant {

	public Resultpage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//td/a[text()='Pushpa: The Rise - Part 1']")
	private WebElement txtmoviename;


	public WebElement getTxtmoviename() {
		return txtmoviename;
	}
	
}
