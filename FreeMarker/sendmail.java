package com.mail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;

import org.testng.annotations.Test;

public class sendmail {
	
	@Test
     public void send() throws Exception{
         //0.1 ȷ������λ��
         Properties props = new Properties();
         //��ȡ163����smtp�������ĵ�ַ��
         props.setProperty("mail.host", "smtp.126.com");
         //�Ƿ����Ȩ����֤��
         props.setProperty("mail.smtp.auth", "true");               
         //0.2ȷ��Ȩ�ޣ��˺ź����룩
         Authenticator authenticator = new Authenticator() {
             @Override
             public PasswordAuthentication getPasswordAuthentication() {
                 //��д�Լ���163����ĵ�¼�ʺź���Ȩ���룬��Ȩ����Ļ�ȡ���ں������н��⡣
                 return new PasswordAuthentication("yl1998@126.com","yl1998");
             }
         };
         Session session = Session.getDefaultInstance(props, authenticator);
         //2 ������Ϣ
         Message message = new MimeMessage(session);
         // 2.1 ������        xxx@163.com �����Լ��������ַ����������
         message.setFrom(new InternetAddress("yl1998@126.com"));

         message.setRecipient(RecipientType.TO, new InternetAddress("1981183186@qq.com"));
         // 2.3 ���⣨���⣩
         message.setSubject("�ʼ��ı���");
          
         String spath="D:\\java1\\auto2018\\auto2018\\src\\com\\freemark\\test.html";
         InputStreamReader isReader = null;
         BufferedReader bufReader = null;
         StringBuffer buf = new StringBuffer();
         try {
            File file = new File(spath);
            isReader = new InputStreamReader(new FileInputStream(file), "utf-8");
            bufReader = new BufferedReader(isReader);
            String data = null;
            while((data=bufReader.readLine()) != null){
                 buf.append(data).append("\n");
             }
         } catch (Exception e) {
           //TODO �����쳣
            } finally {
             //TODO �ر���
            	if(isReader!=null){
    				try {
    					isReader.close();
    				} catch (IOException e) {
    					e.printStackTrace();
    				}
    			}
    			if(bufReader!=null){
    				try {
    					bufReader.close();
    				} catch (IOException e) {
    					e.printStackTrace();
    				}
    			}
            }
         
//           return buf.toString(); 


         message.setContent(buf.toString(), "text/html;charset=UTF-8");               
         //3������Ϣ
         Transport.send(message);
         System.out.println("success");
        }
}
       

