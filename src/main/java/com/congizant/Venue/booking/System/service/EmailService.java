package com.congizant.Venue.booking.System.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailService {
	
	@Autowired
    private JavaMailSender emailSender;

    public void sendSimpleMessage(
      String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage(); 
        message.setFrom("noreply@gmail.com");
        message.setTo(to); 
        message.setSubject(subject); 
        message.setText(text);
        System.out.println(message);
        try {
        	emailSender.send(message);
        }catch(Exception e) {
        	System.out.println(e.toString());
        }
        
    }
}
