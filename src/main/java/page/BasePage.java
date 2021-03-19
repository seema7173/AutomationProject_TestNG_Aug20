package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	public int randomnumber(int bound) {
		Random ran  = new Random();
		int random = ran.nextInt();
		return random;
		
	}
	
	public void dropdown(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByVisibleText("");
		
	}

}