package com.ojas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.entities.TravelEntity;
import com.ojas.service.TravelServiceImpl;

@RestController
//@RequestMapping("/api/v1/")
public class TravelController {
	@Autowired
	private TravelServiceImpl travelServiceImpl;
	@PostMapping("/seat")
	public ResponseEntity<TravelEntity> createSeat(@RequestBody TravelEntity travelEntity){
		TravelEntity createSeat = travelServiceImpl.createSeat(travelEntity);
		return new ResponseEntity<TravelEntity>(createSeat,HttpStatus.OK);
	}
	@GetMapping("/seats")
	public List<TravelEntity> getAll(){
		List<TravelEntity> allSeats = travelServiceImpl.getAllSeats();
		return allSeats;
	}
	@DeleteMapping("/deleteSeat/{id}")
	public void deleteSeat(@PathVariable Integer id) {
		travelServiceImpl.deleteSeat(id);
	}
	@PutMapping("/updateSeat/{id}")
	public ResponseEntity<TravelEntity> updateSeat(@RequestBody TravelEntity travelEntity,Integer id){
		TravelEntity updateSeat = travelServiceImpl.updateSeat(travelEntity, id);
		return new ResponseEntity<TravelEntity>(updateSeat,HttpStatus.OK) ;
	}
	@GetMapping("/getSeat/{id}")
	public ResponseEntity<TravelEntity> getSeatId(@PathVariable Integer id){
		TravelEntity seatId = travelServiceImpl.getSeatId(id);
		return new ResponseEntity<TravelEntity>(seatId,HttpStatus.OK);
	}
	
}
