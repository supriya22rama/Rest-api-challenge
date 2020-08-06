package com.altmetrik.flights.Flights.controller;

import static org.junit.Assert.*;

import java.util.Collections;

import org.json.JSONException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = FlightController.class , webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FlightControllerTest {

	TestRestTemplate template = new TestRestTemplate();
	HttpHeaders header = new HttpHeaders();
	
	@LocalServerPort
	private int port;
	
	@Before
	public void before() {
		header.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
	}
	
	public String createURIWithPort(String url) {
		return "http://localhost:"+port+url;
	}

	@Test
	public void getFlightDetails() throws JSONException {	
		String url =createURIWithPort("/flights?source=Bangalore&destination=Delhi&departure=2020-08-05&arrival=2020-08-05");
		HttpEntity<String> entity = new HttpEntity<String>(null,header);
		ResponseEntity<String> response = template.exchange(url, HttpMethod.GET, entity, String.class);
		String expected = "-{flightNumber: \"7344\",\r\n" + 
				"airlineName: \"Qantas\",\r\n" + 
				"departure: \"2020-08-05T00:45:00.000+00:00\",\r\n" + 
				"arrival: \"2020-08-05T02:20:00.000+00:00\",\r\n" + 
				"duration: null,\r\n" + 
				"numberOfStops: 0,\r\n" + 
				"price: 0,\r\n" + 
				"totalNumberOfResults: 0}";
		JSONAssert.assertEquals(expected, response.getBody(), false);
	}
}
