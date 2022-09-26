package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assesment1.Vagrant;

public class Searchpage extends Vagrant {
public Searchpage() {
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//input[@id='suggestion-search']")
private WebElement txtSearch;

public WebElement getTxtSearch() {
	return txtSearch;
}
}
