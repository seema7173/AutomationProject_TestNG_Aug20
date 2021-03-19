package test;


import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Addcategory;
import page.Addcategory;
import page.BasePage;
import util.BrowserFactory;

public class TC_01 extends BasePage {
	
	WebDriver driver;
	
	@Test
	public void LaunchTheBrowser() {
		driver = BrowserFactory.init();
		
		Addcategory add = PageFactory.initElements(driver, Addcategory.class);
		
		add.Add_A_Catagory("4356");
		add.click_Add_button();
		
		//add.validatemonths();
		
		}
	}
