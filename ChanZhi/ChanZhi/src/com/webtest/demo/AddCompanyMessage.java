package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
//公司信息
public class AddCompanyMessage extends BaseTest {
	@Test
	public void addMessage() throws InterruptedException {
//		Admin_Login_Cz.adminlogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'设置')]");
		webtest.click("xpath=//a[contains(.,'公司')]");
		webtest.click("xpath=//a[contains(.,'公司信息')]");
		webtest.typeAndClear("id=name", "青鸟息壤网络信息有限公司");
		webtest.tapClick();
		webtest.tapType("青鸟息壤网络信息有限公司");
		webtest.click("xpath=//th[contains(.,'公司介绍')]");
		webtest.tapClick();
		webtest.tapType("青鸟息壤网络信息有限公司");
		webtest.click("xpath=//th[contains(.,'公司介绍')]");
		Thread.sleep(3000);
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.click("id=submit");
		Thread.sleep(3000);
	}
}
