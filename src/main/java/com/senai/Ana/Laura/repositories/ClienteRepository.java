package com.senai.Ana.Laura.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.Ana.Laura.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
