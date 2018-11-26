package com.webtest.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Test;

import com.webtest.utils.Log;
import com.freemark.FreeMarker;
/**
 * author:lihuanzhen
 * 监听器，用例失败，截屏
 */


public class WebTestListener  extends TestListenerAdapter{
	  @Override
	  public void onTestFailure(ITestResult tr) {
		  
		  Log.error(tr.getInstance()+"-"+tr.getName()+"运行失败，需要截屏");
		  BaseTest tb = (BaseTest) tr.getInstance();
          WebDriver driver = tb.getDriver();    
		  SeleniumScreenShot ss = new SeleniumScreenShot(driver);
		  ss.screenShot();
		  
	  }
	  
	  
	  	@Test
		@Override
		public void onFinish(ITestContext testContext) {
			// TODO 自动生成的方法存根
			super.onFinish(testContext);
			
			
			Map<String, Object> dataMap =new HashMap<String, Object>();
			dataMap.put("stuname","chanzhi");

			
			List<ITestResult> fail=this.getFailedTests();
			List<ITestResult> success=this.getPassedTests();
			
			System.out.println("测试结果如下：");
			System.out.println("失败的测试用例"+fail);
			System.out.println("成功的测试用例"+success);
			
			
			dataMap.put("slist1", fail);
			dataMap.put("slist",success);
			try {
				FreeMarker.freemarker("src/com/freemark/templates","src/com/freemark","report.ftl",dataMap);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
//			Map<ITestResult,List> mapfail = new HashMap<>();
//		        for (ITestResult list : fail) {
//		            mapfail.put(list, fail);
//		        }
//		        System.out.println("map失败"+mapfail);
//		        
//		    
//		    Map<ITestResult,List> mapsuccess = new HashMap<>();
//		        for (ITestResult list : success) {
//		            mapsuccess.put(list, success);
//		        }
//		        System.out.println("map成功"+mapsuccess);
		        
		    
		    
		}
}
