package com.example.demo.ControllerAndDAO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Ticket;
// comment added
@RestController
@RequestMapping(value = "/")
public class CrudController {
	
	

	@Autowired
	private TicketBookingService bookingService;
	@Autowired
	TicketBookingDao bookingDao;

//	@GetMapping("/name")
//	public String getName() {
//		return "sanath";
//	}

	@PostMapping("/create")
	public Ticket saveNewTicket() {
		Ticket ticket = new Ticket("sanath", "HYD", "delhi");
		Ticket ticket1 = bookingDao.save(ticket);
		// System.out.println(ticket1);
		System.out.println(bookingDao.count());
		return ticket1;
		

	}

	@PostMapping("/createAll")
	public Iterable<Ticket> saveMultipleTickets() {
		Ticket ticket = new Ticket("sanath", "HYD", "mumbai");
		Ticket ticket1 = new Ticket("sanath", "HYD", "mumbai");
		List<Ticket> list = new ArrayList<Ticket>();
		list.add(ticket);
		list.add(ticket1);
		Iterable<Ticket> tickets = bookingDao.saveAll(list);
		// System.out.println(ticket1);
		return tickets;

	}

	@GetMapping("/getAll")
	public Iterable<Ticket> getAllTickets() {
		throw new NullPointerException();
		//return bookingDao.findAll();
	}

	@GetMapping("/getById")
	public Optional<Ticket> getTicetsById() {
		return bookingDao.findById(1);

	}

	@GetMapping("/getByMultipleIds")
	public Iterable<Ticket> getTicetsByMultipleId() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 6; i++) {
			list.add(i);
		}
		return bookingDao.findAllById(list);

	}

	@PutMapping("/update")
	public Ticket updateById() {
		int id = 2;
		String un = "updated destination name";
		Ticket ticket = bookingDao.findById(id).orElse(new Ticket());
		ticket.setDstinationStation(un);
		return bookingDao.save(ticket);
	}

	@DeleteMapping("/deleteAll")
	public void deleteAllTickets() {
		bookingDao.deleteAll();

	}

	@DeleteMapping("/deleteAllFromEntityList")
	public void deleteAllTicketsInEntityList() {
		List<Ticket> list = new ArrayList<>();
		Ticket ticket = new Ticket(77,"sanath", "s", "ff");
		Ticket ticket1 = new Ticket(88,"ff", "d", "ss");
		list.add(ticket1);
		list.add(ticket);
		bookingDao.deleteAll(list);
	}

	@DeleteMapping("/deleteAllFromIdList")
	public void deleteAllTicketsInIdList() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		bookingDao.deleteAllById(list);
	}
}
