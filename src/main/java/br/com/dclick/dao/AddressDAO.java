package br.com.dclick.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.dclick.model.Address;

@Repository
public interface AddressDAO extends CrudRepository<Address, String> {

}
