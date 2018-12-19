package qgtest;

import java.util.Set;

import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.util.Cookie;

import net.sf.json.JSONObject;

public class AddressNewTest {
	String url="http://study-perf.qa.netease.com/fgadmin/address/new";
	@Test
	public void addressnew1() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�㽭��ѧ");
		address.element("province", "�㽭ʡ");
		address.element("city", "������");
		address.element("area", "������");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew2() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", 123);
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�㽭��ѧ");
		address.element("province", "�㽭ʡ");
		address.element("city", "������");
		address.element("area", "������");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew3() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "����");
		address.element("cellPhone", 12345678901.0);
		address.element("addressDetail", "�㽭��ѧ");
		address.element("province", "�㽭ʡ");
		address.element("city", "������");
		address.element("area", "������");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew4() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", 123);
		address.element("province", "�㽭ʡ");
		address.element("city", "������");
		address.element("area", "������");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew5() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�㽭��ѧ");
		address.element("province", 571);
		address.element("city", "������");
		address.element("area", "������");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew6() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�㽭��ѧ");
		address.element("province", "�㽭ʡ");
		address.element("city", 571);
		address.element("area", "������");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew7() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�㽭��ѧ");
		address.element("province", "�㽭ʡ");
		address.element("city", "������");
		address.element("area", 571);
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew8() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�㽭��ѧ");
		address.element("province", "�㽭ʡ");
		address.element("city", "������");
		address.element("area", "������");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew9() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "����");
		address.element("addressDetail", "�㽭��ѧ");
		address.element("province", "�㽭ʡ");
		address.element("city", "������");
		address.element("area", "������");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew10() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("province", "�㽭ʡ");
		address.element("city", "������");
		address.element("area", "������");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew11() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�㽭��ѧ");
		address.element("city", "������");
		address.element("area", "������");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew12() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�㽭��ѧ");
		address.element("province", "�㽭ʡ");
		address.element("area", "������");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew13() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�㽭��ѧ");
		address.element("province", "�㽭ʡ");
		address.element("city", "������");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew14() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "������ѧ");
		address.element("province", "�Ϻ���");
		address.element("city", "�Ϻ���");
		address.element("area", "������");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew15() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�Ͼ���ѧ");
		address.element("province", "����ʡ");
		address.element("city", "�Ͼ���");
		address.element("area", "������");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew16() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�Ͼ���ѧ");
		address.element("province", "�㽭ʡ");
		address.element("city", "�Ͼ���");
		address.element("area", "������");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew17() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�Ͼ���ѧ");
		address.element("province", "����ʡ");
		address.element("city", "������");
		address.element("area", "������");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew18() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�Ͼ�����");
		address.element("province", "����ʡ");
		address.element("city", "�Ͼ���");
		address.element("area", "������");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew19() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�㽭��ѧ");
		address.element("province", "�㽭ʡ");
		address.element("city", "������");
		address.element("area", "������");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew20() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�㽭��ҵ��ѧ");
		address.element("province", "�㽭ʡ");
		address.element("city", "������");
		address.element("area", "������");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew21() throws Exception {
		//δ��¼
		JSONObject address = new JSONObject();
		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�㽭��ѧ");
		address.element("province", "�㽭ʡ");
		address.element("city", "������");
		address.element("area", "������");
		String result=HtmlUnit.doPost(url, address);	
		System.out.println(result);
	}
	@Test
	public void addressnew22() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�㽭��ѧ");
		address.element("province", "�㽭ʡ");
		address.element("city", "������");
		address.element("area", "������");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew23() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "����");
		address.element("cellPhone", "null");
		address.element("addressDetail", "�㽭��ѧ");
		address.element("province", "�㽭ʡ");
		address.element("city", "������");
		address.element("area", "������");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}

}
