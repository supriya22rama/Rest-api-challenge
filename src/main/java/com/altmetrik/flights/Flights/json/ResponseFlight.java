package com.altmetrik.flights.Flights.json;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseFlight {

	private Pagination pagination;
	private List<Flights> data;

	@JsonProperty("pagination")
	public Pagination getPagination() {
		return pagination;
	}
	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}
	
	
	@JsonProperty("data")
	public  List<Flights> getData() {
		return data;
	}
	public void setData(List<Flights> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "ResponseFlight [pagination=" + pagination + ", data=" + data + "]";
	}
	
	
}
