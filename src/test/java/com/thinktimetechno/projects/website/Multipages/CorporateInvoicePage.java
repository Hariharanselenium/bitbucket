package com.thinktimetechno.projects.website.Multipages;

import org.openqa.selenium.By;
import org.testng.Assert;
import com.anhtester.keywords.WebUI;

public class CorporateInvoicePage {

	public void invoice(String string) {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//p[normalize-space()='"+string+"']"));
	}

	public void invoiceassertion() {
		// TODO Auto-generated method stub
		
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[@class=\"common-title\"]")), "My Invoices");
	}

	public void coursename(String string) {
		WebUI.setText(By.xpath("//input[@id='search_name']"), string);
		
	}

	public void courseassertion() {
		// TODO Auto-generated method stub
		Assert.assertEquals(
			    WebUI.getTextElement(By.xpath("//td[normalize-space()='Elder Care']")),
			    "Elder Care"
			);}

	public void viewinvoice() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//td[normalize-space()='Elder Care']/following-sibling::td[5]/a[@class='action-detail_invoice']"));
	}

	public void popupassertion() {
		// TODO Auto-generated method stub
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[normalize-space()='Invoice To']")), "Invoice To");
	}

	public void download() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//a[@class='employees-invite_student']/i"));
	}

	public void close() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//button[@class='employees-purchase_code']"));
	}

	public void completepayment() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//a[@class='action-purchase_now']"));
	}




}
