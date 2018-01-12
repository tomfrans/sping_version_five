package com.tomfrans.spring.spring5.repositories;

import org.springframework.data.repository.CrudRepository;

import com.tomfrans.spring.spring5.model.Manager;

public interface ManagerRepository extends CrudRepository<Manager, Long>{

}
