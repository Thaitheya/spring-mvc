package com.chainsys.spring_mvc.dto;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.spring_mvc.pojo.Appointments;
import com.chainsys.spring_mvc.pojo.Doctors;

public class DoctorAppointmentDTO {

	
	private Doctors doctor;
	private List<Appointments> appointmentList = new ArrayList<Appointments>();
	
	public Doctors getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctors doctor) {
		this.doctor = doctor;
	}
	
	public void addAppointment(Appointments addApp) {
		appointmentList.add(addApp);
	}
	public List<Appointments> getAppointments() {
		 return appointmentList;
	}
}
