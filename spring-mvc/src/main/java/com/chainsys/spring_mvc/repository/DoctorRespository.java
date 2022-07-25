package com.chainsys.spring_mvc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.spring_mvc.pojo.Doctors;

public interface DoctorRespository extends CrudRepository<Doctors,Integer>{
	Doctors findById(int id);
	Doctors save(Doctors dr);
	// Used for both adding new Doctor and Modifying new Doctor
	void deleteById(int dr_id);
	List <Doctors> findAll();
	// int getNextAppointmentId();
}
