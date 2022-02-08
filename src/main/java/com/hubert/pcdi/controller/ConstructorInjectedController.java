package com.hubert.pcdi.controller;

import com.hubert.pcdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
  private final GreetingService constructorGreetingService;

  public ConstructorInjectedController(GreetingService constructorGreetingService) {
    this.constructorGreetingService = constructorGreetingService;
  }

  public String getGreeting() {
    return constructorGreetingService.sayGreeting();
  }
}
