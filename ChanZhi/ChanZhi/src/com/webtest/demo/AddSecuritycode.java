package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
//验证码设置
public class AddSecuritycode extends BaseTest{
	@Test
    public void addscode() throws InterruptedException {
//    	Admin_Login_Cz.adminlogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'安全')]");
		webtest.click("xpath=//a[contains(.,'验证码设置')]");
        webtest.type("id=question[]", "问题1");
        webtest.type("id=answer[]", "答案1");
        webtest.click("id=submit");
	}
}
