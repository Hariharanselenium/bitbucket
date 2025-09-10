package com.thinktimetechno.projects.website.pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import com.anhtester.keywords.WebUI;

public class StorePage {

	public void assertion() {
		// TODO Auto-generated method stub
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[@class='common-title']")),"Learntastic Store");
	}

	public void storeitem() {
		// TODO Auto-generated method stub
		WebUI.selectOptionByValue(By.xpath("//div[@id='item_product_select_3']/div/div/div[@class='store-info_course']/select"), "3001");
	}

	public void quantity() {
		// TODO Auto-generated method stub
		//WebUI.selectOptionByValue(By.xpath("//div[@id='item_product_select_3']/div/div/div[@class='store-info_quantity']/select"), "1");
		//WebUI.clickElement(By.xpath("//div[@id='item_product_select_3']/div/button"));
		//my code
		  WebUI.selectOptionByValue(By.xpath("//select[@name='product_3_webinar']"), "3001");
		    WebUI.clickElement(By.xpath("//div[@id='item_product_select_3']/div/button"));
		//end my code
		
		
		
	}

	public void storeitem1() {
		// TODO Auto-generated method stub
		WebUI.selectOptionByValue(By.xpath("//div[@id='item_product_select_4']/div/div/div[@class='store-info_course']/select"), "3001");
		

	}
	
	public void quantity1() {
		// TODO Auto-generated method stub
		//WebUI.selectOptionByValue(By.xpath("//div[@id='item_product_select_4']/div/div/div[@class='store-info_quantity']/select"), "1");
		WebUI.selectOptionByValue(
			    By.xpath("//select[@name='product_4_webinar']"),
			    "3001"
			);


		
		WebUI.clickElement(By.xpath("//div[@id='item_product_select_4']/div/button"));
		//WebUI.clickElement(By.xpath("//select[@name='product_4_webinar']"));
	}
	
}
