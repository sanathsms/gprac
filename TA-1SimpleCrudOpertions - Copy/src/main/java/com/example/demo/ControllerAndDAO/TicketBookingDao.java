package com.example.demo.ControllerAndDAO;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Ticket;
@Repository
public interface TicketBookingDao extends CrudRepository<Ticket, Integer> {

	
	
}
