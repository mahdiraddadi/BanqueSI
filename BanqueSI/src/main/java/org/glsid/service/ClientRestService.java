package org.glsid.service;

import java.util.List;

import org.glsid.entities.Client;
import org.glsid.metier.ClientMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientRestService {
	@Autowired
	private ClientMetier clientMetier;
	@RequestMapping(value="/client", method=RequestMethod.POST)
	public Client saveClient(@RequestBody Client c) {
		return clientMetier.saveClient(c);
	}
	@RequestMapping(value="/client", method=RequestMethod.GET)
	public List<Client> listClient() {
		return clientMetier.listClient();
	}
	
}
