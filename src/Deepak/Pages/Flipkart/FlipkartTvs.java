package Deepak.Pages.Flipkart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Deepak.Flipkart.Base.TestBase;
import Deepak.Utility.Flipkart.Constants;

public class FlipkartTvs extends TestBase {
	
	@FindBy(xpath = Constants.AvailableBrand)
	WebElement Brand;
	@FindBy(xpath = Constants.TVSize)
	WebElement Size;
	@FindBy(xpath = Constants.TVPrize)
	WebElement Price;
	@FindBy(xpath = Constants.Sorting)
	WebElement SortBy;
	
	public void getYourTV(){
		Brand.click();
		Size.click();
		Price.click();
		SortBy.sendKeys("Price - High to Low");
		
	}
	

}
