package com.devj.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devj.domain.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
