package com.thinktimetechno.projects.website.Multipages;



import org.openqa.selenium.By;
import org.testng.Assert;
import com.anhtester.keywords.WebUI;

public class CorporateDistributionPage {
   String code ="";
	public void assertion() {
		// TODO Auto-generated method stub
	code =	WebUI.getTextElement(By.xpath("//td[normalize-space()='Unused']/following-sibling::td[1]"));
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[@class='common-title']")), "Course Distribution");
		
	}

	public void assigncode() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//a[@class='employees-purchase_code']"));
	}

	public void codesassign() throws InterruptedException {
		// TODO Auto-generated method stub
		WebUI.waitForElementPresent(By.xpath("//label[normalize-space()='Purchase Code']/following-sibling::span/span/span"));
		WebUI.clickElement(By.xpath("//label[normalize-space()='Purchase Code']/following-sibling::span/span/span"));
	     WebUI.setText(By.xpath("//input[@class='select2-search__field']"), code);
	     WebUI.mouseHover(By.xpath("//li[contains(text(),"+code+")]"));
	     WebUI.pressENTER();

		WebUI.moveToElement(By.xpath("//label[normalize-space()='Select Employee']/following-sibling::span/span"));
	
        WebUI.waitForElementPresent(By.xpath("//label[normalize-space(text())='Select Employee']/following-sibling::span//span[@aria-disabled='false']"), 10);
		WebUI.clickElementWithJs(By.xpath("//label[normalize-space(text())='Select Employee']/following-sibling::span//span[@aria-disabled='false']"));
	    WebUI.setText(By.xpath("//input[@class='select2-search__field']"), "John");
	    WebUI.pressENTER();
	}

	public void save() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//label[normalize-space()='Purchase Code']"));
		WebUI.waitForElementClickable(By.xpath("//button[@class='button_add_code_modal']"));
		WebUI.clickElementWithJs(By.xpath("//button[@class='button_add_code_modal']"));
		WebUI.clickElementWithJs(By.xpath("//button[@class='employees-purchase_code']"));
	}

	public void assertion1() {
		// TODO Auto-generated method stub
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//td[normalize-space()='Active']/following-sibling::td[2]")), "John1 Doe");
	}

	public void assertiontotal() {
		// TODO Auto-generated method stub
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[normalize-space()='Total Certification']")),"Total Certification");
	}

	public void searchbar() {
		// TODO Auto-generated method stub
		WebUI.setText(By.xpath("//input[@id='keyword']"), "Sahil");
	}

	public void button() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//button[@class='button_search']"));
	}

	public void assertionemployee() {
		// TODO Auto-generated method stub
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//td[normalize-space()='1']/following-sibling::td[1]")), "Sahil Dongre");
	}



}
