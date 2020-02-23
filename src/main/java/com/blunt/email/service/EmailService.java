package com.blunt.email.service;

import com.blunt.email.dto.EmailContentDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class EmailService {

  private final JavaMailSender emailSender;

  public void sendEmail(EmailContentDto emailContentDto){
    SimpleMailMessage message = new SimpleMailMessage();
    message.setTo(emailContentDto.getToEmail());
    message.setSubject(emailContentDto.getSubject());
    message.setText(emailContentDto.getContent());

    emailSender.send(message);
  }
}
