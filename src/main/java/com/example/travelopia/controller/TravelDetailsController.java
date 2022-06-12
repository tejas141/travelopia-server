package com.example.travelopia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.travelopia.domain.TravelDetails;
import com.example.travelopia.service.TravelDetailsService;

@RestController
@RequestMapping("travel-details")
@CrossOrigin("*")
public class TravelDetailsController {

	@Autowired
	private TravelDetailsService travelDetailsService;

	@PostMapping
	public ResponseEntity<TravelDetails> saveTravelDetails(@RequestBody TravelDetails travelDetails) {
		return ResponseEntity.ok().body(travelDetailsService.saveTravelDetails(travelDetails));
	}
	
	@GetMapping
	public ResponseEntity<List<TravelDetails>> getAllTravelDetails() {
		return ResponseEntity.ok().body(travelDetailsService.getAllTravelDetails());
	}
	
}
