package com.blunt.email.dto;

import lombok.Data;

@Data
public class EmailContentDto {
  private String toEmail;
  private String subject;
  private String content;
}
