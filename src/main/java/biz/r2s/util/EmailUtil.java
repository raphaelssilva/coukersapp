package biz.r2s.util;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailUtil {
	
	public static Message criarEmail(String para, String de, String assunto, String texto){
		 Properties props = new Properties();
	        Session session = Session.getDefaultInstance(props, null);

	        try {
		        Message msg = new MimeMessage(session);
		        
					msg.setFrom(new InternetAddress(de, ""));
				
		        msg.addRecipient(Message.RecipientType.TO,  new InternetAddress(para,""));
		        msg.setSubject(assunto);
		        msg.setText(texto);
		        return msg;
	            
	        } catch (MessagingException e) {
	        	e.printStackTrace();
	        } catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
	        return null;
	}
	
	public static boolean send(Message email){
		try {
			Transport.send(email);
			return true;
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return false;
	}	
}
