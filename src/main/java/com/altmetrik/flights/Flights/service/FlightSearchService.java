package com.altmetrik.flights.Flights.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.altmetrik.flights.Flights.json.Airline;
import com.altmetrik.flights.Flights.json.Flights;
import com.altmetrik.flights.Flights.json.ResponseFlight;
import com.altmetrik.flights.Flights.model.FlightDetails;

@Component
public class FlightSearchService {
	
	@Value("${api.key}")
	private String apiKey;

	ResponseFlight response = new ResponseFlight();
	List<FlightDetails> flightDetails = new ArrayList<FlightDetails>();
	
	public ResponseFlight searchFlights(String source, String destination, Date departure, Date arrival){
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>("", header);
		//http://api.aviationstack.com/v1/flights?limit=2&dep_iata=AAN&arr_iata=AAF&access_key=4851303ba063772c560f780d105848f1
		//response = restTemplate.getForObject("http://api.aviationstack.com/v1/flights?limit=10&dep_iata="+source+"&arr_iata="+destination+"&access_key="+apiKey, ResponseFlight.class);
		response = restTemplate.getForObject("http://api.aviationstack.com/v1/flights?limit=1&access_key="+apiKey, ResponseFlight.class);
		//ResponseEntity<ResponseFlight> response = restTemplate.exchange("http://api.aviationstack.com/v1/flights?limit=2&access_key=4851303ba063772c560f780d105848f1", HttpMethod.GET,entity , ResponseFlight.class);
		//return obj;
		return response;
	}
	
/*	public List<FlightDetails> orderByAirline(){
		List<Flights> flights = response.getData();
		List<Airline> airlines = new ArrayList<Airline>();
		
		String flightNumber;
		String airlineName;
		Date departure;
		Date arrival;

		for(Flights f: flights) {
			airlines.add(f.getAirline());
			flightNumber = f.getFlight().getNumber();
			airlineName = f.getAirline().getName();
			departure = f.getDeparture().getScheduled();
			arrival = f.getArrival().getScheduled();
			FlightDetails flight = new FlightDetails();
			flight.setFlightNumber(flightNumber);
			flight.setAirlineName(airlineName);
			flight.setDeparture(departure);
			flight.setArrival(arrival);
			flightDetails.add(flight);
			
		}
		
		airlines.stream().sorted().collect(Collectors.toList());
		System.out.println(airlines);
		flights.stream().sorted().collect(Collectors.toList());
		System.out.println(flights);
		return flightDetails;
	}
*/}
