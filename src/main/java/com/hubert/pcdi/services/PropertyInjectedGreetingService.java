package com.hubert.pcdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService{
  @Override
  public String sayGreeting() {
    return "HELLO WORLD!!!!! - Property}";
  }
}
