package com.altmetrik.flights.Flights.comparator;

import java.util.Comparator;

import com.altmetrik.flights.Flights.model.FlightDetails;

public class FlightDepartureComparator implements Comparator<FlightDetails>{

	public int compare(FlightDetails o1, FlightDetails o2) {
		if(o1.getDeparture().before(o2.getDeparture()))
			return 1;
		else if(o1.getDeparture().after(o2.getDeparture()))
			return -1;
		else
			return 0;
	}

}
