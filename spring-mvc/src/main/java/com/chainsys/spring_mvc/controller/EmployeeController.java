package com.chainsys.spring_mvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.spring_mvc.dao.EmployeeDao;
import com.chainsys.spring_mvc.pojo.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@RequestMapping("/list")
	public String getAllEmployees(Model model) {

		List<Employee> emplist = EmployeeDao.getAllEmployee();
		model.addAttribute("allemployees", emplist);
		return "list-employee";
	}

	@GetMapping("/addform")
	public String showAddForm(Model model)
	{
		Employee theEmp=new Employee();
		model.addAttribute("addemployee", theEmp);
		return "addEmployeeForm";
	}
    @PostMapping("/add")
	public String addNewEmployees(@ModelAttribute("addemployee") Employee theEmp) {
		EmployeeDao.insertEmployee(theEmp);
		return "redirect:/employee/list";
	}
	@GetMapping("/updateform")
	public String showUpdateForm(@RequestParam("employee_id") int id,Model model)
	{
		Employee theEmp=EmployeeDao.getEmployeeById(id);
		model.addAttribute("updateemployee", theEmp);
		return "updateEmployeeForm";
	}
    @PostMapping("/updateemp")
	public String updateEmployees(@ModelAttribute("updateemployee") Employee theEmp) {
		EmployeeDao.updateEmployee(theEmp);
		return "redirect:/employee/list";
	}
    @GetMapping("/deleteemployee")
	public String deleteEmployees(@RequestParam("employee_id") int id) {
		EmployeeDao.deleteEmployee(id);
		return "redirect:/employee/list";
	}
    @GetMapping("/findemployeebyid")
	public String findEmployeeById(@RequestParam("employee_id") int id,Model model) {
    	Employee theEmp=EmployeeDao.getEmployeeById(id);
    	model.addAttribute("findemployeebyid", theEmp);
		return "findEmployeeById";
	}
}
