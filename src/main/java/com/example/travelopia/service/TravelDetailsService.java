package com.example.travelopia.service;

import java.util.List;

import com.example.travelopia.domain.TravelDetails;

public interface TravelDetailsService {

	public TravelDetails saveTravelDetails(TravelDetails travelDetails);
	
	public List<TravelDetails> getAllTravelDetails();
}
