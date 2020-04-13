package com.practice.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;

public class UIMethods {
	
	public static void selectDropdownItem(WebDriver driver, String elementInput, By element){
		List <WebElement> elementOptions = driver.findElements(element);
		for(WebElement elementOption : elementOptions){
			String dropDownOption = elementOption.getText();
			if(dropDownOption.equals(elementInput)){
				elementOption.click();
				break;
			}
		}
	}

}
