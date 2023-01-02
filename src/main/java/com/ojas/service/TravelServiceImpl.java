package com.ojas.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.entities.TravelEntity;

import com.ojas.repo.TravelRepo;
@Service
public class TravelServiceImpl implements TravelService{
	@Autowired
	private TravelRepo travelRepo;
	@Override
	public TravelEntity createSeat(TravelEntity travelEntity) {
		TravelEntity save = travelRepo.save(travelEntity);
		return save;
	}

	@Override
	public List<TravelEntity> getAllSeats() {
		List<TravelEntity> findAll = travelRepo.findAll();
		return findAll;
	}

	@Override
	public void deleteSeat(Integer id) {
		travelRepo.deleteById(id);
		
	}

	@Override
	public TravelEntity updateSeat(TravelEntity travelEntity ,Integer id) {
		 TravelEntity travelEntity2 = travelRepo.findById(travelEntity.getId()).get();
		TravelEntity update = travelRepo.save(travelEntity);
		return update;
	}

	@Override
	public TravelEntity getSeatId(Integer id) {
		TravelEntity getid = travelRepo.findById(id).get();
		return getid;
	}

}
