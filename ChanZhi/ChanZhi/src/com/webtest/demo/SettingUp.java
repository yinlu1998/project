package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class SettingUp extends BaseTest{
	int n=1;
	int i=1;
	@Test
    public void settingUp() throws InterruptedException {
//		Admin_Login_Cz.adminlogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'�̳�')]");
		webtest.click("xpath=//a[@href='/chanzhi/www/admin.php?m=product&f=setting']");
		webtest.click("xpath=//a[@class='chosen-single']");
		webtest.keysDown();
		webtest.keysEnter();
		if(n==0) {
			webtest.click("xpath=//input[@id='stock1']");
		}else if(n==1) {
			webtest.click("xpath=//input[@id='stock2']");
		}
		webtest.typeAndClear("xpath=//input[@id='confirmLimit']", "8");
		webtest.typeAndClear("xpath=//input[@id='exireLimit']", "31");
		if(i==1) {
			webtest.click("xpath=//input[@id='payment1']");
			webtest.type("xpath=//input[@id='pid']", "������ID");
			webtest.type("xpath=//input[@id='key']", "������KEY");
			webtest.type("xpath=//input[@id='email']", "֧��������");
		}else if(i==2) {
			webtest.click("xpath=//input[@id='payment2']");
			webtest.type("xpath=//input[@id='pid']", "������ID");
			webtest.type("xpath=//input[@id='key']", "������KEY");
			webtest.type("xpath=//input[@id='email']", "֧��������");
		}else if(i==3) {
			webtest.click("xpath=//input[@id='payment3']");
		}else if(i==4) {
			webtest.click("xpath=//input[@id='payment4']");
			webtest.type("xpath=//input[@id='wechat[appid]']", "���ں�APPID");
			webtest.type("xpath=//input[@id='wechat[mch_id]']", "�̻���");
			webtest.type("xpath=//input[@id='wechat[appsecret]']", "���ں��ܳ�");
			
			
		}
		webtest.click("id=submit");
    }
}
