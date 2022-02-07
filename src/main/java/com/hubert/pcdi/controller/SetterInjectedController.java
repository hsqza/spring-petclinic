package com.hubert.pcdi.controller;

import com.hubert.pcdi.services.GreetingService;

public class SetterInjectedController {

  private GreetingService greetingService;

  public void setGreetingService(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String getGreeting() {
    return greetingService.sayGreeting();
  }
}
