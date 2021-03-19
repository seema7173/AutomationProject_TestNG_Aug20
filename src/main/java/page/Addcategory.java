package page;

import java.awt.List;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Addcategory extends BasePage {

	WebDriver driver;
	String input = "";
	


	public Addcategory(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//body/div[4]/span[1]/input[1]")
	WebElement category;
	@FindBy(how = How.XPATH, using = "//body/div[4]/span[1]/input[2]")
	WebElement addbutton;
	@FindBy(how = How.XPATH, using = "//body")
	 WebElement Body;
	@FindBy(how = How.XPATH, using = "//body/div[4]/span[1]/select[3]")
	WebElement months;
	


	public void Add_A_Catagory(String name) {
		category.sendKeys(name);
		input = name;
		category.isDisplayed();
		
		
	}

	public void click_Add_button() {
		addbutton.click();
		
	}

	  public void Insidebody() {
		  
		  String expected = "The category you want to add already exists: " + input+ ".";
		  
		  String bodyText = Body.getText();
		  String bodTextArry[] = bodyText.split("\n");
		  
		  String firstLine = bodTextArry[0];
		  System.out.println("FirstLine: " + firstLine);
		  
		  Assert.assertEquals(firstLine, expected);
		  
		  //int nComp =  firstLine.compareToIgnoreCase(expected);
		  
		 //Assert.assertEquals(nComp, 0, "not matched");

		 // NilimaAssert(firstLine, expected, "not matched");
	}
	  
	/*
	 * private void NilimaAssert(String input, String expected, String errMsg) { int
	 * nComp = input.compareToIgnoreCase(expected); if (nComp != 0) { throw new
	 * Error(errMsg); } }
	 */

	// if(addbutton.addbutton.isDisplayed()) {}

	public void validatemonths() {

		Select select = new Select(months);
		select.getOptions();

		for (WebElement element : select.getOptions()) {
			System.out.println(element.getText());
		}

		// List expectedlist = new ArrayList();

		/*
		 * String arr[] =
		 * {"None","Jan","Feb","Mar","Mar","May","Jun","Jul","Aug","Sep","Oct","Nov",
		 * "Dec"}; WebElement dropdown = getDriver().findElement(By.name("due_month"));
		 * 
		 * Select select = new Select(dropdown); List<WebElement> options =
		 * sel.getOptions(); java.util.List<WebElement> options = select.getOptions();
		 * 
		 * for(WebElement we : options){ for(int i = 1; i<arr.length; i++){
		 * if(we.getText().equals(arr[i])){ System.out.println("Matched" ); break; } }}
		 */

		// String arr[] =
		// {"None","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		// Assert.assertEquals("actual", arr[]);

	}
}
