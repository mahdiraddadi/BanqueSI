package org.glsid.metier;

import java.util.List;

import org.glsid.entities.Employe;

public interface EmployeMetier {
	public Employe save(Employe e);
	public List<Employe> listEmploye();

}
