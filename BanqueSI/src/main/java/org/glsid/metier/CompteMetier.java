package org.glsid.metier;

import org.glsid.entities.Compte;

public interface CompteMetier {
	
	public Compte saveCompte(Compte c);
	public Compte getCompte(String code);

}
