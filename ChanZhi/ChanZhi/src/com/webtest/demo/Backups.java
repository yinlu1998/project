package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Backups extends BaseTest{

	@Test
	public void backups() throws Exception {
//		Admin_Login_Cz.adminlogin();
		webtest.click("xpath=//a[contains(.,'����')]");
		webtest.click("xpath=//a[contains(.,'���ݻ�ԭ')]");

		webtest.click("id=backupBtn");
		webtest.click("xpath=//button[contains(.,'ȷ��')]");
		Thread.sleep(5000);
	}
}
