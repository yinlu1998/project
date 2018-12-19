package qgtest;

import java.util.Set;

import org.apache.http.client.CookieStore;
import org.testng.annotations.Test;

import qgtest.Common;
import com.gargoylesoftware.htmlunit.util.Cookie;

import net.sf.json.JSONObject;

public class SubmitTest {

	@Test
	public void submit1() throws Exception {
		String url="http://study-perf.qa.netease.com/fgadmin/orders/submit";
		Set<Cookie> cookie=Common.getLoginCookie();
		JSONObject submit = new JSONObject();
		submit.element("skuIds", "2,3");
		submit.element("skuNumbers", "1,1");
		submit.element("stockIds", "74966312,74966313");
		submit.element("receiverName", "�����û�42");
		submit.element("cellPhone", "15868470172");
		submit.element("addressDetail", "����·599");		
		submit.element("province", "�㽭ʡ");
		submit.element("city", "������");
		submit.element("area", "������");		
		submit.element("voiceStatus", 0);
		submit.element("needInvoice", 0);
		submit.element("invoiceHead","" );
		submit.element("transportFee", 0);
		submit.element("logisticsCompanyId", 1);
		submit.element("accessSource", "noSource");
		submit.element("accessDevice", 0);
		String result=HtmlUnit.doPostByCookie(url, submit, cookie);
		System.out.println(result);	
	}
	@Test
	public void submit2() throws Exception {
		String url="http://study-perf.qa.netease.com/fgadmin/orders/submit";
		JSONObject submit = new JSONObject();
		submit.element("skuIds", "2,3");
		submit.element("skuNumbers", "1,1");
		submit.element("stockIds", "74966312,74966313");
		submit.element("receiverName", "�����û�42");
		submit.element("cellPhone", "15868470172");
		submit.element("addressDetail", "����·599");		
		submit.element("province", "�㽭ʡ");
		submit.element("city", "������");
		submit.element("area", "������");		
		submit.element("voiceStatus", 0);
		submit.element("needInvoice", 0);
		submit.element("invoiceHead","" );
		submit.element("transportFee", 0);
		submit.element("logisticsCompanyId", 1);
		submit.element("accessSource", "noSource");
		submit.element("accessDevice", 0);
		String result=HtmlUnit.doPost(url, submit);
		System.out.println(result);	
	}
	@Test
	public void submit3() throws Exception {
		String url="http://study-perf.qa.netease.com/fgadmin/orders/submit";
		Set<Cookie> cookie=Common.getLoginCookie();
		JSONObject submit = new JSONObject();
		submit.element("skuIds", "2,3");
		submit.element("skuNumbers", "1,1");
		submit.element("stockIds", "74966312,74966313");
		submit.element("receiverName", "�����û�");
		submit.element("cellPhone", "15868470172");
		submit.element("addressDetail", "����·599");		
		submit.element("province", "�㽭ʡ");
		submit.element("city", "������");
		submit.element("area", "������");		
		submit.element("voiceStatus", 0);
		submit.element("needInvoice", 0);
		submit.element("invoiceHead","" );
		submit.element("transportFee", 0);
		submit.element("logisticsCompanyId", 1);
		submit.element("accessSource", "noSource");
		submit.element("accessDevice", 0);
		String result=HtmlUnit.doPostByCookie(url, submit, cookie);
		System.out.println(result);	
	}
}
