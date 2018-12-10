package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddSetting extends BaseTest{
	int n=0;
    @Test
    public void addset() throws InterruptedException {
//    	Admin_Login_Cz.adminlogin();

		
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'内容')]");
		webtest.click("xpath=//a[contains(.,'手册')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(@href,'/chanzhi/www/admin.php?m=book&f=setting')]");
		webtest.selectByIndex("xpath=//select[@id='index']",0);
		webtest.keysEnter();
		if(n==0) {
			webtest.click("xpath=//input[contains(.,'是')]");
		}else if(n==1) {
			webtest.click("xpath=//input[contains(.,'否')]");
		}
		webtest.selectByIndex("xpath=//select[@id='chapter']", 0);
		webtest.click("id=submit");
    }
}
