package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Groups extends BaseTest{
//新增分组
	
	@Test
	public void group() throws Exception {
		
//		Admin_Login_Cz.adminlogin();		

		webtest.click("xpath=//a[contains(.,'设置')]");
		webtest.click("xpath=//a[contains(.,'安全')]");
		webtest.click("xpath=//a[contains(.,'分组权限')]");
		webtest.click("xpath=//a[contains(.,'新增分组')]");
		webtest.type("id=name", "管理员1");
		webtest.type("id=desc", "管理后台所有权限");
		webtest.click("id=submit");
		Thread.sleep(5000);
		
	}
	
	
	
	
}
