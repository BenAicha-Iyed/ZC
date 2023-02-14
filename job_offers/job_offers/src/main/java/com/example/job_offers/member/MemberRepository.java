package com.example.job_offers.member;

import org.springframework.data.repository.CrudRepository;

import com.example.job_offers.user.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface MemberRepository extends CrudRepository<Member, Integer> {

}
