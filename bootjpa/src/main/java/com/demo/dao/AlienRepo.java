package com.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.demo.Alien;

public interface AlienRepo extends JpaRepository<Alien,Integer>
{

	
}
