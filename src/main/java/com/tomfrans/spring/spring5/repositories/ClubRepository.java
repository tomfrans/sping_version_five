package com.tomfrans.spring.spring5.repositories;

import org.springframework.data.repository.CrudRepository;

import com.tomfrans.spring.spring5.model.Club;

public interface ClubRepository extends CrudRepository<Club, Long> {

}
