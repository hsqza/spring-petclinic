package com.hubert.petclinic.service;

import com.hubert.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

  Pet findById(Long id);

  Pet save(Pet pet);

  Set<Pet> findAll();
}
