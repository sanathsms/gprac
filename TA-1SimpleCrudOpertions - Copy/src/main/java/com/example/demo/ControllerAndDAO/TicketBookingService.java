package com.example.demo.ControllerAndDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TicketBookingService {
	
	@Autowired	
	TicketBookingDao bookingDao;

}
