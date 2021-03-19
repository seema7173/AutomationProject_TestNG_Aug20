package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Addcategory;
import page.Addcategory;
import util.BrowserFactory;

@Test

public class TC_02 {

	WebDriver driver;
	String input;

	public void LaunchTheBrowser()  {

		driver = BrowserFactory.init();

		Addcategory add = PageFactory.initElements(driver, Addcategory.class);

		add.Add_A_Catagory("786");
		//add.click_Add_button();
		
		//add.Insidebody();
		//add.validatemonths();

	}

}
