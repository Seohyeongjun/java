package study;

import javax.mail.PasswordAuthentication;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import javax.mail.Message;

public class SendEmail {

	public static void sendEmail(String fromEmail, String title, String content) {
		// 문의글 등록되면 관리자 이메일로 전송하기 
		
		// 관리자 이메일 계정 설정
		final String adminEmail = "s25hj936@naver.com";
		final String password = "5BK7W8WQH8B7";
		
		// 관리자 이메일 환경설정 등록
		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.naver.com");	// smtp서버명
		prop.put("mail.smtp.port", "587");		// smtp포트번호
		prop.put("mail.smtp.starttls.enable", "true"); //tls사용여부
		prop.put("mail.smtp.auth", "true");	// smtp서버인증
		
		// 문의글이 등록되며녀 관리자 이메일로 전송 되어야 한다. 
		// 보내는 사람과받는 사람이 필요한데 보내는 사람은 클라이언트이지만 실제 클라이언트 메일에서 발송되는게 아니라
		// 자바에서 발송하는 것이기 때문에 관리자가 보내고 받고를 해야한다. 
		Session adminAuth = Session.getInstance (prop, new javax.mail.Authenticator() {
									protected PasswordAuthentication getPasswordAuthentication() {
										return new PasswordAuthentication(adminEmail, password);
										}
									});
	
		try {
			MimeMessage msg = new MimeMessage(adminAuth);
			msg.setFrom( new InternetAddress(adminEmail));	//보내는 이메일 주소
			
			msg.setHeader("Content-Tupe",  "text/html;charset=utf-8");
			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(adminEmail));	// 받는 이메일주소
			
			msg.setHeader("Content-Type", "text/html;charset=utf-8");
			msg.setSubject("문의 글 등록 ["+title+"]-"+fromEmail);	// 이메일 제목
			
			
			msg.setContent(
					"<h3>문의 내용</h3><b>"+content+"</b> "
					+ "<div><a href ='http://localhost:8080/jsp_study_1/study/?part=inquiry'>"
					+"문의글 확인</a></div>", "text/html;charset=utf-8");
			
			Transport.send(msg);	//메일 전송
			
		}catch(MessagingException e) {
			e.printStackTrace();
			System.out.println("이메일 전송 실패");;
		}
		
		
	}	

}
