package com.ojas.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.entities.TravelEntity;
@Repository
public interface TravelRepo extends JpaRepository<TravelEntity, Integer> {

}
