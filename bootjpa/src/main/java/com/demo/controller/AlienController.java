package com.demo.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.demo.Alien;
import com.demo.dao.AlienRepo;

@RestController
public class AlienController
{
	@Autowired
	AlienRepo repo;
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@DeleteMapping("/dalien/{aid}")
	public void deleteAlien(@PathVariable int aid)
	{
		repo.deleteById(aid);
		System.out.println("Delete Succesfully...........");
		
		
	}
	
	@PostMapping("/alien")
	public Alien addAlien(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
		
	}
	
	@PutMapping("/alien")
	public String saveOrUpdateAlien(@RequestBody Alien alien)
	{
		repo.save(alien);
		return "Your Data is updated" + alien.toString();
		
	}
	
	
	
	@RequestMapping("/alien")

	public List<Alien> grtAlien()
	{
		
		
		return repo.findAll();
		
	}
	@RequestMapping("/alien/{aid}")

	public Optional<Alien> grtAliens(@PathVariable("aid") int aid)
	{
		
		
		return repo.findById(aid);
		
	}
}
