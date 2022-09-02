package com.springcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springcrud.beans.Employee;
import com.springcrud.dao.EmployeeDao;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeDao dao;
	
	
	
	@RequestMapping("/viewemp")
	public String viewemp(Model model){
		List<Employee> empList= dao.getEmployeesDetails();
		
		model.addAttribute("empList",empList);
		return "viewemp";
	}
	//Show Empty form
	@RequestMapping(value="/empform", method=RequestMethod.GET)
	public String showForm(Model m){
	Employee emp=new Employee();
	m.addAttribute("emp", emp);
		
		return "empform";
	}
	
	//Save Record
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save(@ModelAttribute("emp") Employee emp){
		dao.insert(emp);
	
	return "redirect:/viewemp";
	}
	
	
	//delete mapping
	@RequestMapping(value="/deleteemp/{eid}", method=RequestMethod.GET)
	public String deleterecord(@PathVariable("eid") int eid){
		dao.delete(eid);
		return "redirect:/viewemp";
	}	
	
	// Search a record for editing and throw all information on editform
	@RequestMapping(value="/editemp/{eid}", method=RequestMethod.GET)
	public String editrecord(@PathVariable int eid, Model m){
		
		Employee emp=dao.getEmpId(eid);
		m.addAttribute("emp",emp);
		return "empeditform";
	}
	
	//save changes
	@RequestMapping(value="/editsave",method=RequestMethod.POST)
	public String editSave(@ModelAttribute("emp") Employee emp){
		
		
		dao.update(emp);
		return "redirect:/viewemp";
	}
	
		
	
	
}
