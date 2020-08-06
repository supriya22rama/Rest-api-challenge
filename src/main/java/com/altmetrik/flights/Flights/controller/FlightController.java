package com.altmetrik.flights.Flights.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.altmetrik.flights.Flights.json.Flights;
import com.altmetrik.flights.Flights.json.ResponseFlight;
import com.altmetrik.flights.Flights.model.FlightDetails;
import com.altmetrik.flights.Flights.service.FlightSearchService;

@RestController
public class FlightController {
	
	@InitBinder
	public void initBinder(WebDataBinder web) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		web.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

	@Autowired
	private FlightSearchService service;
	
	@GetMapping("/flights")
	public List<FlightDetails> searchFlights(@RequestParam String source,@RequestParam String destination, 
			@DateTimeFormat(pattern = "dd-MM-yyyy")  Date departure, @DateTimeFormat(pattern = "dd-MM-yyyy")  Date arrival){
		ResponseFlight response = service.searchFlights(source, destination, departure, arrival);
		String flightNumber;
		String airlineName;
		Date departureNew;
		Date arrivalNew;

		List<FlightDetails> flightDetails = new ArrayList<FlightDetails>();
		for(Flights f: response.getData()) {
			flightNumber = f.getFlight().getNumber();
			airlineName = f.getAirline().getName();
			departureNew = f.getDeparture().getScheduled();
			arrivalNew = f.getArrival().getScheduled();
			FlightDetails flight = new FlightDetails();
			flight.setFlightNumber(flightNumber);
			flight.setAirlineName(airlineName);
			flight.setDeparture(departureNew);
			flight.setArrival(arrivalNew);
			flightDetails.add(flight);
		}
		
		return flightDetails;
	}
	
}
