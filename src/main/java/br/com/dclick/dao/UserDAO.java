package br.com.dclick.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import br.com.dclick.model.User;

@Repository
public class UserDAO {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	public User save(User user) {
		mongoTemplate.save(user);
		return user;
	}
	
	public List<User> list() {
		return mongoTemplate.findAll(User.class);
	}
}
