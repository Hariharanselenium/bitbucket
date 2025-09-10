package com.thinktimetechno.projects.website.Multipages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.anhtester.driver.DriverManager;
import com.anhtester.keywords.WebUI;

public class CorporateRegistrationPage {
	private By inputEmail= By.xpath("//input[@id='email']");
	private By inputPassword = By.xpath("//input[@name='password']");
	private By policyButton = By.xpath("//input[@name='term']");
	private By mobileno = By.xpath("//input[@name='mobile']");
	private By firstname = By.xpath("//input[@name='first_name']");
	private By lastname = By.xpath("//input[@name='last_name']");

   // private final By companyName      = By.name("company_name");
   // private final By email            = By.name("email");
   // private final By btnGetStartedTxt = By.xpath("//button[normalize-space()='Get Started']");
	
    //private final By firstName = By.id("first_name");
   // private final By lastName  = By.name("last_name");
   // private final By mobile    = By.name("mobile");
  //  private final By password  = By.name("password");
    
   // private final By btnGetStartedAgain = By.cssSelector(".next-step.btn.btn-primary.next-grp.get-started");
    
   // private final By categorySelect    = By.name("category_id");
   // private final By subcategorySelect = By.id("subcategory-select");///
	
    
    
	
	
	
	
	public void register01(String fname, String lname, String email, String password, String mobile) {
		String dateTime = new java.text.SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
		String emailAddress = email.replace("johny", "johny" + dateTime);
		WebUI.setText(firstname, fname);
		WebUI.setText(lastname, lname);
		WebUI.setText(inputEmail, emailAddress);
		WebUI.setText(mobileno, mobile);
		WebUI.setText(inputPassword, password);
		WebUI.clickElement(policyButton);

	}

	public void register00(String fname, String lname, String email, String password, String mobile) {

		String dateTime = new java.text.SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
		String emailAddress = email.replace("johny", "johny" + dateTime);

		WebUI.waitForPageLoaded();
		WebUI.waitForElementClickable(By.xpath("//input[@name='first_name']"));
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].value='';", WebUI.getWebElement(firstname));

		WebUI.setText(By.xpath("//input[@id='first_name']"), fname);
		WebUI.setText(lastname, lname);
		WebUI.setText(mobileno, mobile);
		WebUI.setText(By.xpath("//input[@id='email']"), emailAddress);
		WebUI.setText(inputPassword, password);
		WebUI.clickElement(policyButton);

	}

	public void registergroup(String fname, String lname, String email, String password, String mobile,
			String invitecode) {
		String dateTime = new java.text.SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
		String emailAddress = email.replace("johndoe", "johndoe" + dateTime);
		WebUI.setText(firstname, fname);
		WebUI.setText(lastname, lname);
		WebUI.setText(mobileno, mobile);
		WebUI.setText(By.xpath("//input[@id='email']"), emailAddress);
		WebUI.setText(mobileno, mobile);
		WebUI.setText(inputPassword, password);
		WebUI.setText(By.xpath("//input[@id='invite_code']"), invitecode);
		WebUI.clickElement(policyButton);

	}

	public void signIn() {
		WebUI.clickElement(By.id("signupBtn"));

	}

	public void joinFree() throws InterruptedException {

		WebUI.clickElement(By.xpath("//button[contains(.,'Join For Free')]"));

	}

	public void dashboardassertion() {
		WebUI.waitForPageLoaded();
		Assert.assertEquals(WebUI.getPageTitle(), "Purchased courses list | Learntastic");

	}

	public void registerassertion() {
		WebUI.waitForPageLoaded();
		Assert.assertEquals(WebUI.getPageTitle(), "Register | learntastic | online courses");
//		WebUI.waitForElementClickable(
//				By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
//		WebUI.clickElementWithJs(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
		if (WebUI.verifyElementExists(
				By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"))) {
			WebUI.moveToElement(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
			WebUI.clickElementWithJs(
					By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
		}
	}

	public void registerassertion1() {
		WebUI.waitForPageLoaded();
		Assert.assertEquals(WebUI.getPageTitle(), "Online Courses and Career Opportunities");

	}
	
	

	public void dashboard01() {
		Assert.assertEquals(WebUI.getPageTitle(), "Dashboard | Learntastic");

	}

	public void loginassertion() {
		WebUI.waitForPageLoaded();
		Assert.assertEquals(WebUI.getPageTitle(), "Student Login | Learntastic");

	}

	public void register02() {
		WebUI.clickElement(By.xpath("//button[@class='close dis-modal-close']"));
		WebUI.clickElement(By.xpath("//span[contains(.,'Log In  with Google')]"));

	}

	public void googleassertion() {
		Assert.assertEquals(WebUI.getPageTitle(), "Sign in - Google Accounts");

	}

	public void gmailInput() {
		WebUI.setText(By.xpath("//input[@id=\"identifierId\"]"), "shankar@thinktime.in");
		WebUI.clickElement(By.xpath("//span[contains(.,'Next')]"));

	}

	public void gmailPassword() {
		WebUI.setText(By.xpath("//input[@name=\"Passwd\"]"), "123456789");
		WebUI.clickElement(By.xpath("//span[contains(.,'Next')]"));

	}

	public void popupclose() {
		WebElement element = WebUI.waitForElementVisible(By.xpath("//button[@class='close dis-modal-close']"));

		// Use JavaScript Executor to click the element
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", element);
	}

	public void groupdiscount() {
		WebElement discount = WebUI.getWebElement(By.xpath("//a[normalize-space()='Group Discount']"));
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", discount);
	}

	public void groupdiscountassert() {
		Assert.assertEquals(WebUI.getPageTitle(), "Login");
	}

	public void checkboxselection() {
		WebElement termsCheckbox = WebUI.getWebElement(
				By.xpath("//label[contains(text(),'I agree with')]/preceding-sibling::input[@id='term']"));

		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", termsCheckbox);
	}

	public void registerbutton() {
		WebUI.clickElement(By.xpath("//button[normalize-space()='Register']"));
	}

	public void joinforfree() throws InterruptedException {
		WebUI.waitForElementVisible(
				By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
		WebUI.clickElement(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
		WebUI.clickElementWithJs(
				By.xpath("//div[@class='home-item_desc']/descendant::button[contains(text(),'Join for free')]"));

	}

	public void popupassertion() {
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//p[contains(text(),'Sign up & start learning')]")),
				"Sign up & start learning");

	}

	public void registergroupdetail(String fname, String lname, String companyname, String mobile, String email,
			String password) {
		String dateTime = new java.text.SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
		String emailid = email.replace("Orgdemo", "Orgdemo" + dateTime);

		WebUI.setText(By.xpath("//input[@id='first_name']"), fname);
		WebUI.setText(By.xpath("//input[@name='last_name']"), lname);
		WebUI.setText(By.xpath("//input[@name='company_name']"), companyname);
		WebUI.setText(By.xpath("//input[@name='mobile']"), mobile);
		WebUI.setText(By.xpath("(//input[@id='email'])[1]"), emailid);
		WebUI.setText(By.xpath("//input[@name='password']"), password);
	}

}
