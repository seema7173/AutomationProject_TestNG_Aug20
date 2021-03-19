package test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.Addcategory;
import page.Addcategory;
import page.BasePage;
import util.BrowserFactory;

@Test

public class TC_03  {

	WebDriver driver;
	
	public void validatemonths() {

		driver = BrowserFactory.init();

		Addcategory add = PageFactory.initElements(driver, Addcategory.class);

		Select select = new Select(driver.findElement(By.xpath("//body/div[4]/span[1]/select[3]")));
		// select.getOptions();
		List listActual = new ArrayList();

		for (WebElement element : select.getOptions()) {
			// System.out.println(element.getText());
			listActual.add(element.getText());

		}
		List ExpectedDropDown = new ArrayList();
		ExpectedDropDown.add("None");
		ExpectedDropDown.add("Jan");
		ExpectedDropDown.add("Feb");
		ExpectedDropDown.add("Mar");
		ExpectedDropDown.add("Apr");
		ExpectedDropDown.add("May");
		ExpectedDropDown.add("Jun");
		ExpectedDropDown.add("Jul");
		ExpectedDropDown.add("Aug");
		ExpectedDropDown.add("Sep");
		ExpectedDropDown.add("Oct");
		ExpectedDropDown.add("Nov");
		ExpectedDropDown.add("Dec");

		for (int i = 0; i < listActual.size(); i++) {
			System.out.println(listActual.get(i) + " \t " + ExpectedDropDown.get(i));
			Assert.assertTrue(listActual.get(i).equals(ExpectedDropDown.get(i)));
		}

	}
}
