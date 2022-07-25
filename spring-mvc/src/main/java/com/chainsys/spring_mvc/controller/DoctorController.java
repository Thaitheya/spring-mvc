package com.chainsys.spring_mvc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.spring_mvc.dto.DoctorAppointmentDTO;
import com.chainsys.spring_mvc.pojo.Appointments;
import com.chainsys.spring_mvc.pojo.Doctors;
import com.chainsys.spring_mvc.service.DoctorService;

@Controller
@RequestMapping("/doctor")
public class DoctorController {

	@Autowired
	DoctorService doctorService;

	@GetMapping("/getdoctor")
	public String getDoctor(@RequestParam("id") int id, Model model) {

		Doctors doc = doctorService.getDoctorById(id);
		model.addAttribute("getDoctor", doc);
		return "find-doctor-by-id";
	}

	@GetMapping("/deletedoctor")
	public String deleteDoctor(@RequestParam("id") int id) {
	  doctorService.deleteById(id);
		return "redirect:/doctor/list";
	}

	@GetMapping("/adddoctorform")
	public String addDoctorForm(Model model) {
		Doctors dr = new Doctors();
		model.addAttribute("addDoctor", dr);
		return "add-doctor-form";

	}

	@PostMapping("/add")
	public String addNewDoctor(@ModelAttribute("addDoctor") Doctors thedoc) {
	    doctorService.save(thedoc);
		return "redirect:/doctor/list";

	}

	@GetMapping("/modifydoctorform")
	public String showModifiedDoctor(@RequestParam("id") int id, Model model) {
		Doctors dr = doctorService.findById(id);
		model.addAttribute("updateDoctor", dr);
		return "update-doctor-form";

	}

	@PostMapping("/modifydoctor")
	public String modifyDoctor(@ModelAttribute("modifydoctor") Doctors thedoctor) {
		 doctorService.save(thedoctor);
		return "redirect:/doctor/list";
	}

	@RequestMapping("/list")
	public String getAllDoctor(Model model) {
		List<Doctors> getAllDoctors = doctorService.getdoctors();
		model.addAttribute("getalldoctor", getAllDoctors);

		return "list-doctor";
	}
	@GetMapping("/getdoctorappointment")
	public String getAppointments(@RequestParam("id") int id, Model model) {
		DoctorAppointmentDTO dto = doctorService.getDoctorAndAppointments(id);
		model.addAttribute("getdoctor",dto.getDoctor());
		model.addAttribute("applist",dto.getAppointments());
		return "list-doctor-appointments";
	}
	@GetMapping("/trans")
	public void testTransaction(@RequestParam("id") int id) {
      
		DoctorAppointmentDTO dto = new DoctorAppointmentDTO();
		Doctors dr = new Doctors();
		dr.setDoctor_id(id);
		dr.setDoctor_name("Thaitheyasudan");
		Date dt = new Date(22,9,35);
		dr.setDob(dt);
		dr.setCity("Madurai");
		dr.setSpeciality("Blood disease");
		dr.setPhone_no(9898433);
		dr.setStandard_fees(290000);
          dto.setDoctor(dr);
		List<Appointments> app = new ArrayList<Appointments>();
		for(int i=0;i<=2;i++) {
			Appointments datapp = new Appointments();
			datapp.setAppointment_id(id);
			Date appdt = new Date(22,2,25);
			datapp.setAppointment_date(appdt);
			datapp.setDoctor_id(id);
			datapp.setPatient_name("tts");
			datapp.setFees_collected(i * 500);
			dto.addAppointment(datapp);
		   }
           doctorService.doctorAndAppointments(dto);
		 System.out.println("Sucessfully inserted");
	}
}
