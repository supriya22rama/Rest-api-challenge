package com.altmetrik.flights.Flights.comparator;

import java.util.Comparator;

import com.altmetrik.flights.Flights.model.FlightDetails;

public class AirlineComparator implements Comparator<FlightDetails>{

	public int compare(FlightDetails o1, FlightDetails o2) {
		return o1.getAirlineName().compareTo(o2.getAirlineName());
	}

}
