package Testriq.BBC;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BbcObjects {
	WebDriver driver;
	public BbcObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath = "//a")
	List<WebElement> bbcLinksList;
	
	public List<WebElement> getBbcLinksList() {
		return bbcLinksList;
	}

	public void setBbcLinksList(List<WebElement> bbcLinksList) {
		this.bbcLinksList = bbcLinksList;
	}


	@FindBy(xpath = "//a[@class='media__link']")
	List<WebElement> bbcTitlesList;
	
	public List<WebElement> getBbcTitlesList() {
		return bbcTitlesList;
	}

	public void setBbcTitlesList(List<WebElement> bbcTitlesList) {
		this.bbcTitlesList = bbcTitlesList;
	}
	
	@FindBy(xpath = "//p[@class='media__summary']")
	List<WebElement> bbcDescList;
	
	public List<WebElement> getBbcDescList() {
		return bbcDescList;
	}

	public void setBbcDescList(List<WebElement> bbcDescList) {
		this.bbcDescList = bbcDescList;
	}
	

}
