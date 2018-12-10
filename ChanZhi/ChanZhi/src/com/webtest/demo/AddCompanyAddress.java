package com.webtest.demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
//公司地址
public class AddCompanyAddress extends BaseTest{
	@Test
    public void addAddress() throws InterruptedException {
//    	Admin_Login_Cz.adminlogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'设置')]");
		webtest.click("xpath=//a[contains(.,'公司')]");
		webtest.click("xpath=//a[contains(.,'联系方式')]");

		webtest.typeAndClear("id=contacts","测试员1");
		webtest.typeAndClear("id=phone", "123456");
		webtest.type("xpath=//*[@id='fax']", "chuanzhen");
		webtest.type("xpath=//*[@id='email']", "123456@qq.com");
		webtest.type("xpath=//*[@id='qq']", "123456");
		webtest.type("xpath=//*[@id='skype']", "skype");
		webtest.type("xpath=//*[@id='weixin']", "weixin");
		webtest.type("xpath=//*[@id='weibo']", "weibo");
		webtest.type("xpath=//*[@id='wangwang']", "wangwang");
		webtest.type("xpath=//*[@id='site']", "wangzhi");
		webtest.type("xpath=//*[@id='address']", "dizhi");
		webtest.tapClick();
		webtest.keysEnter();

		Thread.sleep(5000);
		Reporter.log("设置联系方式");
    }
}
