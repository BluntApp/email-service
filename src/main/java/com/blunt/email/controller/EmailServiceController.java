package com.blunt.email.controller;

import com.blunt.email.dto.EmailContentDto;
import com.blunt.email.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/email")
public class EmailServiceController {

  private final EmailService emailService;

  @GetMapping("test")
  public String test(){
    return "success";
  }

  @PostMapping("send")
  public ResponseEntity<Object> sendEmail(@RequestBody EmailContentDto emailContentDto){
    emailService.sendEmail(emailContentDto);
    return new ResponseEntity<>("Email Sent Successfully", HttpStatus.OK);
  }
}
