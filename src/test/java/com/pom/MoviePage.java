package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assesment1.Vagrant;

public class MoviePage extends Vagrant {
public MoviePage() {
	PageFactory.initElements(driver, this);
}



@FindBy(xpath="//a[text()='Release date']/following-sibling::div//a")
private WebElement releasedate;

@FindBy(xpath="//span[text()='Country of origin']/following-sibling::div//a")
private WebElement countryOforigin;

public WebElement getReleasedate() {
	return releasedate;
}

public WebElement getCountryOforigin() {
	return countryOforigin;
}


}
