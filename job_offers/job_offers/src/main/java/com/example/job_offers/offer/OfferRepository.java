package com.example.job_offers.offer;

import org.springframework.data.repository.CrudRepository;

import com.example.job_offers.offer.Offer;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface OfferRepository extends CrudRepository<Offer, Integer> {

}
