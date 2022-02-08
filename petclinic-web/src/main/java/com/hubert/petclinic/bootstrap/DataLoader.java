package com.hubert.petclinic.bootstrap;

import com.hubert.petclinic.model.Owner;
import com.hubert.petclinic.model.Vet;
import com.hubert.petclinic.service.OwnerService;
import com.hubert.petclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

  private final OwnerService ownerService;
  private final VetService vetService;

  public DataLoader(OwnerService ownerService, VetService vetService) {
    this.ownerService = ownerService;
    this.vetService = vetService;
  }

  @Override
  public void run(String... args) throws Exception {
    Owner owner1 = new Owner();
    owner1.setFirstName("Michał");
    owner1.setLastName("Weston");

    ownerService.save(owner1);

    Owner owner2 = new Owner();
    owner2.setFirstName("Fiona");
    owner2.setLastName("Glenanne");

    ownerService.save(owner2);

    System.out.println("Loaded owners...");

    Vet vet1 = new Vet();
    vet1.setFirstName("Sam");
    vet1.setLastName("Axe");

    vetService.save(vet1);

    Vet vet2 = new Vet();
    vet2.setFirstName("Em");
    vet2.setLastName("Kale");

    vetService.save(vet2);

    System.out.println("Loaded vets...");

  }
}
