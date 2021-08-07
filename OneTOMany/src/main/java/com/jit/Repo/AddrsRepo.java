package com.jit.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jit.model.Address;

public interface AddrsRepo extends JpaRepository<Address, Integer> {

}
