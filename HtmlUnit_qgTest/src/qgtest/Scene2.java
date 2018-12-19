package qgtest;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.util.Cookie;

import net.sf.json.JSONObject;

public class Scene2 {
//δ��¼�����ջ���ַ
	@Test(priority=0)
	public void login() throws Exception {
		String url="http://study-perf.qa.netease.com/common/fgadmin/login";
		JSONObject login = new JSONObject();
		login.element("password", "netease123");
		login.element("phoneArea", "86");
		login.element("phoneNumber", "200000000042");
		String result=HtmlUnit.doPost(url, login);
		System.out.println("login_success"+result);
	}
	@Test(priority=1)
	public void addresslist() throws Exception {
	
		String result=HtmlUnit.doGet("http://study-perf.qa.netease.com/fgadmin/address/list");
		System.out.println(result);
		JSONObject json=JSONObject.fromObject(result);
		Assert.assertEquals(json.getString("message"), "success");
	}
	@Test(priority=2)
	public void fee() throws Exception {
		String url="http://study-perf.qa.netease.com/common/getTransportFee?id=1&addressDetail=�㽭ʡ_������_������";

		String result=HtmlUnit.doGet(url);
		System.out.println(result);
	}
	@Test(priority=3)
	public void submit() throws Exception {
		String url="http://study-perf.qa.netease.com/fgadmin/orders/submit";
		JSONObject submit = new JSONObject();		
		submit.element("skuIds", "2");
		submit.element("receiverName", "����");
		submit.element("cellPhone", "20000000000");
		submit.element("addressDetail", "�㽭��ѧ");
		submit.element("province", "�㽭ʡ");
		submit.element("city", "������");
		submit.element("area", "������");
		submit.element("transportFee", "6.0");
		String result=HtmlUnit.doPost(url, submit);
		System.out.println(result);
	}
}
