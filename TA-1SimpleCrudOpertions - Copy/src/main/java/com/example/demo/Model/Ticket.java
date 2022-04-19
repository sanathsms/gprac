package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "ticket")
public class Ticket {
	@Id
	@Column(name = "ticketId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ticketId;
	@Column(name = "passengerName")
	private String passengerName;
	public Ticket(String passengerName, String sourceStation, String dstinationStation) {
		super();
		this.passengerName = passengerName;
		this.sourceStation = sourceStation;
		this.dstinationStation = dstinationStation;
	}

	@Column(name = "sourceStation")
	private String sourceStation;
	@Column(name = "dstinationStation")
	private String dstinationStation;

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket(int ticketId, String passengerName, String sourceStation, String dstinationStation) {
		super();
		this.ticketId = ticketId;
		this.passengerName = passengerName;
		this.sourceStation = sourceStation;
		this.dstinationStation = dstinationStation;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getSourceStation() {
		return sourceStation;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	public String getDstinationStation() {
		return dstinationStation;
	}

	public void setDstinationStation(String dstinationStation) {
		this.dstinationStation = dstinationStation;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", passengerName=" + passengerName + ", sourceStation=" + sourceStation
				+ ", dstinationStation=" + dstinationStation + "]";
	}

}
