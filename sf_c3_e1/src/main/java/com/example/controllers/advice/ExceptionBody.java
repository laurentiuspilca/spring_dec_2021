package com.example.controllers.advice;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ExceptionBody {

  private final String code;
  private final String description;
}
