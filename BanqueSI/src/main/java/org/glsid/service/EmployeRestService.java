package org.glsid.service;

import java.util.List;

import org.glsid.entities.Employe;
import org.glsid.metier.EmployeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeRestService {
	@Autowired private EmployeMetier employeMetier;
	
	@RequestMapping(value="/employes", method=RequestMethod.POST)
	public Employe save(@RequestBody Employe e) {
		return employeMetier.save(e);
	}
	@RequestMapping(value="employes",method=RequestMethod.GET)
	public List<Employe> listEmploye() {
		return employeMetier.listEmploye();
	}
	
	
}
