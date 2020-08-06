package com.altmetrik.flights.Flights.model;

import java.util.Date;

public class FlightDetails implements Comparable<FlightDetails>{
	
	private String flightNumber;
	private String airlineName;
	private Date departure;
	private Date arrival;
	private Date duration;
	private int numberOfStops;
	private float price;
	private int totalNumberOfResults;
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public Date getDeparture() {
		return departure;
	}
	public void setDeparture(Date departure) {
		this.departure = departure;
	}
	public Date getArrival() {
		return arrival;
	}
	public void setArrival(Date arrival) {
		this.arrival = arrival;
	}
	public Date getDuration() {
		return duration;
	}
	public void setDuration(Date duration) {
		this.duration = duration;
	}
	public int getNumberOfStops() {
		return numberOfStops;
	}
	public void setNumberOfStops(int numberOfStops) {
		this.numberOfStops = numberOfStops;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getTotalNumberOfResults() {
		return totalNumberOfResults;
	}
	public void setTotalNumberOfResults(int totalNumberOfResults) {
		this.totalNumberOfResults = totalNumberOfResults;
	}
	@Override
	public String toString() {
		return "FlightDetails [flightNumber=" + flightNumber + ", airlineName=" + airlineName + ", departure="
				+ departure + ", arrival=" + arrival + ", duration=" + duration + ", numberOfStops=" + numberOfStops
				+ ", price=" + price + ", totalNumberOfResults=" + totalNumberOfResults + "]";
	}
	public int compareTo(FlightDetails o) {
		if(this.getPrice() > o.getPrice()) 
			return 1;
		else if(this.getPrice() > o.getPrice()) 
			return -1;
		else 
			return 0;
	}	
	
}
