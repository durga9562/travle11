package com.ojas.service;

import java.util.List;

import com.ojas.entities.TravelEntity;

public interface TravelService {
public TravelEntity createSeat(TravelEntity travelEntity);
public List<TravelEntity> getAllSeats();
public void deleteSeat(Integer id);
public TravelEntity updateSeat(TravelEntity travelEntity,Integer id);
public TravelEntity getSeatId(Integer id);
}
