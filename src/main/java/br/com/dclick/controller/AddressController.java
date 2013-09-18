package br.com.dclick.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.dclick.dao.AddressDAO;
import br.com.dclick.model.Address;

@Controller
@RequestMapping("/address")
public class AddressController {

	@Autowired
	private AddressDAO addressDAO;
	
	@RequestMapping(method=RequestMethod.PUT)
	@ResponseBody
	public Address save(@RequestBody Address address) {
		return addressDAO.save(address);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public Iterable<Address> list() {
		return addressDAO.findAll();
	}
}
