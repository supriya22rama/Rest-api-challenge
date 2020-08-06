package com.altmetrik.flights.Flights;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.altmetrik.flights.Flights.service.FlightSearchService;

@SpringBootApplication
public class FlightsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cn = SpringApplication.run(FlightsApplication.class, args);
/*		FlightSearchService service = cn.getBean(FlightSearchService.class);
		service.searchFlights("", "", new Date(), new Date());
*/		
	}

}
