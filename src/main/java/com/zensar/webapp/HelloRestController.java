package com.zensar.webapp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloRestController{
  @GetMapping("/hello")
  public String getHelloMessage()
  {
    return "HelloWold";
  }
}
