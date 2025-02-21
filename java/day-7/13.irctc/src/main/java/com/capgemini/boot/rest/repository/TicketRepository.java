package com.capgemini.boot.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.boot.rest.entities.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, String> {

}
