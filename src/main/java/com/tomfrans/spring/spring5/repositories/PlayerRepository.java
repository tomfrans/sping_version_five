package com.tomfrans.spring.spring5.repositories;

import org.springframework.data.repository.CrudRepository;

import com.tomfrans.spring.spring5.model.Player;

public interface PlayerRepository extends CrudRepository<Player, Long>{

}
