package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddBlacklist extends BaseTest{
    @Test
    public void addblist() throws InterruptedException {
//    	Admin_Login_Cz.adminlogin();

		webtest.click("xpath=//a[contains(.,'设置')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'安全')]");

		webtest.click("xpath=//a[contains(.,'黑名单管理')]");
		webtest.click("xpath=//a[contains(.,'添加黑名单')]");
		Thread.sleep(1000);
		webtest.type("xpath=//input[@id='identity']","内容");
		webtest.type("xpath=//input[@id='reason']", "原因");
		webtest.click("xpath=//select[@id='expired']");
		webtest.selectByIndex("id=expired", 2);
		webtest.keysEnter();
		webtest.click("id=submit");
    }
}
