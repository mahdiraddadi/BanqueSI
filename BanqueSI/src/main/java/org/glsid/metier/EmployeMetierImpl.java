package org.glsid.metier;

import java.util.List;

import org.glsid.dao.EmployeRepository;
import org.glsid.entities.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeMetierImpl implements EmployeMetier {
	@Autowired
	private EmployeRepository employeRepository;
	@Override
	public Employe save(Employe e) {
		return employeRepository.save(e);
	}

	@Override
	public List<Employe> listEmploye() {

		return employeRepository.findAll();
	}

	

}
