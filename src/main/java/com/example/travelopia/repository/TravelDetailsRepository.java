package com.example.travelopia.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.travelopia.domain.TravelDetails;

@Repository
public interface TravelDetailsRepository extends MongoRepository<TravelDetails, String> {

}
