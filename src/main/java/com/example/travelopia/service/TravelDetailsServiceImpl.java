package com.example.travelopia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.travelopia.domain.TravelDetails;
import com.example.travelopia.exception.TravelDetailsException;
import com.example.travelopia.repository.TravelDetailsRepository;

@Service
public class TravelDetailsServiceImpl implements TravelDetailsService {

	@Autowired
	private TravelDetailsRepository travelDetailsRepo;
	
	@Override
	public TravelDetails saveTravelDetails(TravelDetails travelDetails) {
		try {
			return travelDetailsRepo.save(travelDetails);
		} catch (Exception e) {
			throw new TravelDetailsException(e.getMessage());
		}
	}
	
	@Override
	public List<TravelDetails> getAllTravelDetails() {
		try {
			return travelDetailsRepo.findAll();
		} catch (Exception e) {
			throw new TravelDetailsException(e.getMessage());
		}
	}
	
}
