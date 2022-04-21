package com.example.demo.ControllerAndDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController("/sa")
public final class c2 {

	@Autowired
	private TicketBookingService bookingService;
	@Autowired
	TicketBookingDao bookingDao;

	@GetMapping("/name")
	public String getName() {
		return "sanath";
	}

}
