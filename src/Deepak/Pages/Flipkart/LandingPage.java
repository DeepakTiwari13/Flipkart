package Deepak.Pages.Flipkart;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import Deepak.Flipkart.Base.TestBase;
import Deepak.Utility.Flipkart.Constants;

public class LandingPage extends TestBase {

	@FindBy(xpath = Constants.MainMenuTop)
	WebElement TopMenu;
	@FindBy(xpath = Constants.SubMenu)
	WebElement SubMenu;
	@FindBy(xpath = Constants.Electronic)
	WebElement ElectronicItemList;
	@FindBy(xpath = Constants.FashionData)
	WebElement FashionList;
	@FindBy(xpath = Constants.BookData)
	WebElement BookList;
	@FindBy(xpath = Constants.OtherStory)
	WebElement AllOtherStories;

	public WebDriver driver;
	public MainTopMenu mainmenu;
	public QuickMenu quickmenu;
	Logger APPLICATION_Logs = Logger.getLogger("LandingPage");

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		System.out.println("In to landing page constructor");
		APPLICATION_Logs.info("In to landing page constructor");
		if (mainmenu == null) {
			mainmenu = PageFactory.initElements(driver, MainTopMenu.class);
		}
		if (quickmenu == null) {
			quickmenu = PageFactory.initElements(driver, QuickMenu.class);
		}

	}

	public void MainTopMenuList() {

		List<WebElement> CompleteItems = TopMenu.findElements(By.tagName("a"));
		for (int i = 0; i < CompleteItems.size(); i++) {
			System.out.println("Printing list of top menu items "
					+ CompleteItems.get(i).getText()
					+ CompleteItems.get(i).isDisplayed());
				APPLICATION_Logs.info("Printing list of top menu items "
					+ CompleteItems.get(i).getText()
					+ CompleteItems.get(i).isDisplayed());
		}
	}

	public void SubMenuList() {
		List<WebElement> SubMenuItems = SubMenu.findElements(By.tagName("a"));
		for (int i = 0; i < SubMenuItems.size(); i++) {
			System.out.println("Printing list of sub menu items "
					+ SubMenuItems.get(i).isDisplayed()
					+ SubMenuItems.get(i).getText());
			APPLICATION_Logs.info("Printing list of sub menu items "
					+ SubMenuItems.get(i).isDisplayed()
					+ SubMenuItems.get(i).getText());
		}
	}

	public void ElectronicItemList() {
		List<WebElement> ElectronicItem = ElectronicItemList.findElements(By
				.tagName("a"));
		for (int i = 0; i < ElectronicItem.size(); i++) {
			System.out.println("Printing list of Electrnoic items "
					+ ElectronicItem.get(i).isDisplayed()
					+ ElectronicItem.get(i).getText());
			APPLICATION_Logs.info("Printing list of Electrnoic items "
					+ ElectronicItem.get(i).isDisplayed()
					+ ElectronicItem.get(i).getText());
		}

	}

	public void FashionList() {
		List<WebElement> FashionItem = FashionList
				.findElements(By.tagName("a"));
		for (int i = 0; i < FashionItem.size(); i++) {
			System.out.println("Printing list of Fashion items "
					+ FashionItem.get(i).isDisplayed()
					+ FashionItem.get(i).getText());
			APPLICATION_Logs.info("Printing list of Fashion items "
					+ FashionItem.get(i).isDisplayed()
					+ FashionItem.get(i).getText());
		}

	}

	public void BookList() {

		List<WebElement> AvailableBooks = BookList
				.findElements(By.tagName("a"));
		for (int i = 0; i < AvailableBooks.size(); i++) {
			System.out.println("Printing list of Books "
					+ AvailableBooks.get(i).isDisplayed()
					+ AvailableBooks.get(i).getText());
			APPLICATION_Logs.info("Printing list of Books "
					+ AvailableBooks.get(i).isDisplayed()
					+ AvailableBooks.get(i).getText());
		}
	}

	public void OtherStores() {

		List<WebElement> AllItem = AllOtherStories
				.findElements(By.tagName("a"));
		for (int i = 0; i < AllItem.size(); i++) {
			System.out.println("Printing list of Other store items "
					+ AllItem.get(i).isDisplayed() + AllItem.get(i).getText());
			APPLICATION_Logs.info("Printing list of Other store items "
					+ AllItem.get(i).isDisplayed() + AllItem.get(i).getText());
		}
	}
}
