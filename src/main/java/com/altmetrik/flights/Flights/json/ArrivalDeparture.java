package com.altmetrik.flights.Flights.json;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArrivalDeparture {
/*	airport: "Shenzhen",
	timezone: "Asia/Shanghai",
	iata: "SZX",
	icao: "ZGSZ",
	terminal: "T3",
	gate: "61B",
	delay: null,
	scheduled: "2020-08-04T07:40:00+00:00",
	estimated: "2020-08-04T07:40:00+00:00",
	actual: null,
	estimated_runway: null,
	actual_runway: null
*/	private String airport;
	private String timezone;
	private String iata;
	private String icao;
	private String terminal;
	private String gate;
	private String delay;
	private Date scheduled;
	private Date estimated;
	private String actual;
	private String estimated_runway;
	private String actual_runway;
	@JsonProperty("airport")
	public String getAirport() {
		return airport;
	}
	public void setAirport(String airport) {
		this.airport = airport;
	}
	@JsonProperty("timezone")
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
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
	@JsonProperty("terminal")
	public String getTerminal() {
		return terminal;
	}
	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}
	@JsonProperty("gate")
	public String getGate() {
		return gate;
	}
	
	public void setGate(String gate) {
		this.gate = gate;
	}
	@JsonProperty("delay")
	public String getDelay() {
		return delay;
	}
	public void setDelay(String delay) {
		this.delay = delay;
	}
	@JsonProperty("scheduled")
	public Date getScheduled() {
		return scheduled;
	}
	public void setScheduled(Date scheduled) {
		this.scheduled = scheduled;
	}
	@JsonProperty("estimated")
	public Date getEstimated() {
		return estimated;
	}
	public void setEstimated(Date estimated) {
		this.estimated = estimated;
	}
	@JsonProperty("actual")
	public String getActual() {
		return actual;
	}
	public void setActual(String actual) {
		this.actual = actual;
	}
	@JsonProperty("estimated_runway")
	public String getEstimated_runway() {
		return estimated_runway;
	}
	public void setEstimated_runway(String estimated_runway) {
		this.estimated_runway = estimated_runway;
	}
	@JsonProperty("actual_runway")
	public String getActual_runway() {
		return actual_runway;
	}
	public void setActual_runway(String actual_runway) {
		this.actual_runway = actual_runway;
	}
	@Override
	public String toString() {
		return "Departure [airport=" + airport + ", timezone=" + timezone + ", iata=" + iata + ", icao=" + icao
				+ ", terminal=" + terminal + ", gate=" + gate + ", delay=" + delay + ", scheduled=" + scheduled
				+ ", estimated=" + estimated + ", actual=" + actual + ", estimated_runway=" + estimated_runway
				+ ", actual_runway=" + actual_runway + "]";
	}
	
	
}
