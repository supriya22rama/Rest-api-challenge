package com.altmetrik.flights.Flights.json;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Flights implements Comparable<Flights>{

	private Date flight_date;
	private String flight_status;
	private ArrivalDeparture departure;
	private ArrivalDeparture arrival;
	private Airline airline;
	private Flight flight;
	private String aircraft;
	private String live;
	@JsonProperty("flight_date")
	public Date getFlight_date() {
		return flight_date;
	}
	public void setFlight_date(Date flight_date) {
		this.flight_date = flight_date;
	}
	@JsonProperty("flight_status")
	public String getFlight_status() {
		return flight_status;
	}
	public void setFlight_status(String flight_status) {
		this.flight_status = flight_status;
	}
	@JsonProperty("departure")
	public ArrivalDeparture getDeparture() {
		return departure;
	}
	public void setDeparture(ArrivalDeparture departure) {
		this.departure = departure;
	}
	@JsonProperty("airline")
	public Airline getAirline() {
		return airline;
	}
	public void setAirline(Airline airline) {
		this.airline = airline;
	}
	@JsonProperty("flight")
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	@JsonProperty("aircraft")
	public String getAircraft() {
		return aircraft;
	}
	public void setAircraft(String aircraft) {
		this.aircraft = aircraft;
	}
	@JsonProperty("live")
	public String getLive() {
		return live;
	}
	public void setLive(String live) {
		this.live = live;
	}
	@JsonProperty("arrival")
	public ArrivalDeparture getArrival() {
		return arrival;
	}
	public void setArrival(ArrivalDeparture arrival) {
		this.arrival = arrival;
	}
	@Override
	public String toString() {
		return "Flights [flight_date=" + flight_date + ", flight_status=" + flight_status + ", departure=" + departure
				+ ", arrival=" + arrival + ", airline=" + airline + ", flight=" + flight + ", aircraft=" + aircraft
				+ ", live=" + live + "]";
	}
	public int compareTo(Flights o) {
		if(this.departure.getScheduled().before(o.departure.getScheduled()))
		return 1;
		else if(this.departure.getScheduled().after(o.departure.getScheduled()))
			return -1;
		else 
			return 0;
	}

	
}
