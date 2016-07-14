package org.glsid.rmi;

import java.rmi.RemoteException;

import org.glsid.entities.Compte;
import org.glsid.metier.CompteMetier;
import org.glsid.metier.OperationMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myRmiService")
public class BanqueRmiRemoteImpl implements BanqueRmiRemote {
	
	@Autowired
	CompteMetier compteMetier;
	@Autowired
	OperationMetier operationMetier;
	
	@Override
	public Compte saveCompte(Compte c) throws RemoteException {
		
		return compteMetier.saveCompte(c);
	}

	@Override
	public Compte getCompte(String code) throws RemoteException {
	
		return compteMetier.getCompte(code);
	}

	@Override
	public boolean verser(String code, double montant, Long codeEmp) throws RemoteException {
		
		return operationMetier.verser(code, montant, codeEmp);
	}

	@Override
	public boolean retirer(String code, double montant, Long codeEmp) throws RemoteException {
		
		return operationMetier.retirer(code, montant, codeEmp);
	}

	@Override
	public boolean virement(String cpte1, String cpte2, double montant, Long codeEmp) throws RemoteException {
		
		return operationMetier.virement(cpte1, cpte2, montant, codeEmp);
	}

}
