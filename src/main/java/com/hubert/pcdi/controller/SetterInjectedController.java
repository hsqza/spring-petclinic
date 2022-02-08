package com.hubert.pcdi.controller;

import com.hubert.pcdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

  private GreetingService constructorGreetingService;

  @Autowired
  public void setGreetingService(GreetingService constructorGreetingService) {
    this.constructorGreetingService = constructorGreetingService;
  }

  public String getGreeting() {
    return constructorGreetingService.sayGreeting();
  }
}
