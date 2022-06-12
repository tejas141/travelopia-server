package com.example.travelopia.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "travelopia_travel_details")
public class TravelDetails {

	@Id
	private String id;
	private String name;
	private String email;
	private String destination;
	private int noOfTravellers;
	private double budget;
}
