package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
//添加单页
public class add_Single1 extends BaseTest{
	@Test
	
	public void single() throws Exception {
//		Admin_Login_Cz.adminlogin();		
		webtest.click("xpath=//a[contains(.,'内容')]");
		webtest.click("xpath=//a[contains(.,'单页')]");
		webtest.click("xpath=//a[contains(.,'添加单页')]");


		webtest.type("xpath=//input[@name='title']", "测试单页");
		webtest.type("xpath=//input[@name='alias']", "1");
		webtest.type("xpath=//input[@name='keywords']", "单页");

		webtest.type("xpath=//textarea[@name='summary']", "单页摘要");
		webtest.tapClick();
		webtest.tapType("单页内容");
		Thread.sleep(3000);
		
		webtest.click("xpath(=//th[contains(.,'状态')]");
		webtest.tapClick();
		Thread.sleep(1000);

		webtest.tapClick();
		webtest.keysEnter();

		Thread.sleep(5000);

	}
}
