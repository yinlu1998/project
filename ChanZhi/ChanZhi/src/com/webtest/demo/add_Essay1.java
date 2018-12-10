package com.webtest.demo;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
//发布文章
public class add_Essay1 extends BaseTest{
	@Test	
	public void addessay() throws Exception {
//		Admin_Login_Cz.adminlogin();		

		webtest.click("xpath=//a[contains(.,'内容')]");
		webtest.click("xpath=//i[@class='icon-plus']");

		Thread.sleep(3000);
		webtest.click("xpath=//ul[@class='chosen-choices']");
		webtest.keysDown();
		webtest.keysEnter();
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@name='author']","test");
		
		webtest.click("xpath=//span[contains(.,'原创')]");
		webtest.keysDown();
		webtest.keysEnter();
		webtest.type("xpath=//input[@name='title']", "测试文章");

		Thread.sleep(3000);
		webtest.type("xpath=//input[@name='alias']", "1");
		webtest.type("xpath=//input[@name='keywords']", "文章");
		webtest.type("xpath=//textarea[@name='summary']", "文章摘要");
		webtest.tapClick();
		webtest.tapType("文章内容");
		Thread.sleep(3000);
		webtest.click("id=submit");
		Thread.sleep(3000);

	}
}
