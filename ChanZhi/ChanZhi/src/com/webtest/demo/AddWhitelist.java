package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddWhitelist extends BaseTest{
    @Test
    public void addWlist() throws InterruptedException {
//    	Admin_Login_Cz.adminlogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'��ȫ')]");
		webtest.click("xpath=//a[contains(.,'����������')]");
		webtest.type("xpath=//textarea[@id='ip']", "ip2");
		webtest.type("xpath=//textarea[@id='account']", "�˺�2");
		webtest.type("xpath=//input[@id='password']", "mima2");
		webtest.click("id=submit");
    }
}