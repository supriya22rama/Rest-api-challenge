package com.altmetrik.flights.Flights.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Flight implements Comparable<Flight>{
	private String number;
	private String iata;
	private String icao;
	private Codeshared codeshared;
	@JsonProperty("number")
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
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
	@JsonProperty("codeshared")
	public Codeshared getCodeshared() {
		return codeshared;
	}
	public void setCodeshared(Codeshared codeshared) {
		this.codeshared = codeshared;
	}
	@Override
	public String toString() {
		return "Flight [number=" + number + ", iata=" + iata + ", icao=" + icao + ", codeshared=" + codeshared + "]";
	}
	public int compareTo(Flight o) {
		return this.number.compareTo(o.number);
	}

}
