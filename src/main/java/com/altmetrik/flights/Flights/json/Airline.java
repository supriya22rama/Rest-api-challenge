package com.altmetrik.flights.Flights.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Airline implements Comparable<Airline>{
	private String name;
	private String iata;
	private String icao;
	@JsonProperty("name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@JsonProperty("iata")
	public String getIata() {
		return iata;
	}
	public void setIata(String iata) {
		this.iata = iata;
	}
	@JsonProperty("icao")
	public String getIcao() {
		return icao;
	}
	public void setIcao(String icao) {
		this.icao = icao;
	}
	@Override
	public String toString() {
		return "Airline [name=" + name + ", iata=" + iata + ", icao=" + icao + "]";
	}
	public int compareTo(Airline o) {
		return this.name.compareTo(o.name);
	}
	
	
	
}
