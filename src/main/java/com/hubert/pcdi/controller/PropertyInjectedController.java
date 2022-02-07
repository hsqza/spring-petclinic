package com.hubert.pcdi.controller;

import com.hubert.pcdi.services.GreetingService;

public class PropertyInjectedController {
  public GreetingService greetingService;

  public String getGreeting() {
    return greetingService.sayGreeting();
  }
}
