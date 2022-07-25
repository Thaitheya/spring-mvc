package com.chainsys.spring_mvc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.spring_mvc.pojo.Appointments;

public interface AppointmentRepository extends CrudRepository<Appointments,Integer> {
     
     Appointments findById(int id);
     Appointments save(Appointments app);
     void deleteById(int app_id);
     List <Appointments> findAll();
}
