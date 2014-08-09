package Deepak.Utility.Flipkart;

public class Constants {

	// Config File path
	public static final String ConPath = "E:\\Automation\\EcPProjects1\\PageObjectModel\\src\\Deepak\\Config\\Flipkart\\CONFIG.properties";
	// OR file path
	public static final String ORPath = "E:\\Automation\\EcPProjects1\\PageObjectModel\\src\\Deepak\\Config\\Flipkart\\OR.properties";

	// Drivers path
	public static final String ChromePath = "F:\\Automation\\Java Projects\\PageObjectModel\\src\\Drivers\\chromedriver.exe";

	// Menu
	public static final String Eheader = "//a[@class='menu-text fk-inline-block']/span";
	public static final String MHeader = "//*[@id='fk-mainhead-id']/div[2]/div/div[1]/ul/li[2]/a/span";
	public static final String WomenTab = "//*[@id='fk-mainhead-id']/div[2]/div/div[1]/ul/li[3]/a/span";
	public static final String BabyandKidsTab = "//*[@id='fk-mainhead-id']/div[2]/div/div[1]/ul/li[4]/a/span";
	public static final String BooksandmediaTab = "//*[@id='fk-mainhead-id']/div[2]/div/div[1]/ul/li[5]/a";
	public static final String HomeandKitchenTab = "//*[@id='fk-mainhead-id']/div[2]/div/div[1]/ul/li[6]/a";
	public static final String MoreStoreTab = "//*[@id='fk-mainhead-id']/div[2]/div/div[1]/ul/li[7]/a/span";
	public static final String Offerzonetab = "//*[@id='fk-mainhead-id']/div[2]/div/div[1]/ul/li[8]/a/span";
	public static final String FK = "//*[@id='fk-mainhead-id']/div[1]/div/div[1]/a/img";

	// Landing Page

	public static final String MainMenuTop = "//*[@id='fk-mainhead-id']/div[2]/div";
	public static final String SubMenu = "//*[@id='fk-mainbody-id']/div/div[1]/ul";
	public static final String Electronic = "//*[@id='fk-mainbody-id']/div/div[2]/div[1]/div[1]/div[2]";
	public static final String FashionData = "//*[@id='fk-mainbody-id']/div/div[2]/div[1]/div[1]/div[3]";
	public static final String BookData = "//*[@id='fk-mainbody-id']/div/div[2]/div[1]/div[1]/div[4]";
	public static final String OtherStory = "//*[@id='fk-mainbody-id']/div/div[2]/div[1]/div[1]/div[5]";

	// Landing Page QuickMenu

	public static final String Gotoquickmobile = "//*[@id='fk-mainbody-id']/div/div[1]/ul/li[3]/a";
	public static final String Gotoquicktablets = "//*[@id='fk-mainbody-id']/div/div[1]/ul/li[4]/a";
	public static final String Gotoquickmobileaccessories = "//*[@id='fk-mainbody-id']/div/div[1]/ul/li[5]/a";
	public static final String GotoquickLaptops = "//*[@id='fk-mainbody-id']/div/div[1]/ul/li[6]/a";
	public static final String GotoquickPenDrives = "//*[@id='fk-mainbody-id']/div/div[1]/ul/li[7]/a";
	public static final String GotoquickTVs = "//*[@id='fk-mainbody-id']/div/div[1]/ul/li[8]/a";
	public static final String GotoquickAcs = "//*[@id='fk-mainbody-id']/div/div[1]/ul/li[9]/a";
	public static final String Gotoquickwatches = "//*[@id='fk-mainbody-id']/div/div[1]/ul/li[10]/a";
	public static final String GotoquickToys = "//*[@id='fk-mainbody-id']/div/div[1]/ul/li[11]/a";
	public static final String GotoquickSunglasses = "//*[@id='fk-mainbody-id']/div/div[1]/ul/li[12]/a";
	public static final String GotoquickPerfumes = "//*[@id='fk-mainbody-id']/div/div[1]/ul/li[13]/a";
	public static final String GotoquickGiftVoucher = "//*[@id='fk-mainbody-id']/div/div[1]/ul/li[14]/a";
	
	//Login
	
	public static final String LoginLinkClick = "//*[@id='fk-mainhead-id']/div[1]/div/div[2]/div[1]/ul/li[7]/a";
	public static final String LoginName= "//*[@id='login_email_id']";
	public static final String LoginPwd ="//*[@id='login_password']";
	public static final String EnterButton ="//input[@class='btn btn-blue']";
	public static final String Whoisloggedin = "//*[@id='fk-mainhead-id']/div[1]/div/div[2]/div[1]/ul/li[6]/a";
	
	//Flipkart offer zone
	
	public static final String Offerzone = "//*[@id='fk-mainbody-id']/div/div/div[4]/div/div[1]/div[1]";
	public static final String Endsin ="//*[@id='fk-mainbody-id']/div/div/div[4]/div/div[1]/div[2]";
	public static final String Offers = "//*[@id='fk-mainbody-id']/div/div/div[4]/div/div[2]";
	public static final String Deal1= "//*[@id='fk-mainbody-id']/div/div/div[4]/div/div[2]/div[";
	public static final String Deal2= "]/div";
	
	//Flipkart TVs test
	
	public static final String AvailableBrand = "//*[@id='list-brands']/div[2]/a[2]";
	public static final String TVSize = "//*[@id='screen_size']/li[5]/a/input";
	public static final String TVPrize = "//*[@id='price_range']/li[6]/a/input";
	public static final String Sorting = "//*[@id='sort-dropdown']";
	public static final String DisplayedTv ="//*[@id='products']/div";

}
