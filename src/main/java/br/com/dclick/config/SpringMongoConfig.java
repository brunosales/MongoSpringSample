package br.com.dclick.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.mongodb.MongoClient;

@Configuration
@ComponentScan("br.com.dclick")
@EnableWebMvc
@EnableMongoRepositories("br.com.dclick.dao")
public class SpringMongoConfig {
	
	public @Bean
	MongoDbFactory mongoDbFactory() throws Exception {
		
		MongoClient mongoClient = new MongoClient("127.0.0.1",27017);
		return new SimpleMongoDbFactory(mongoClient, "testedb");
		
	}
 
	public @Bean
	MongoTemplate mongoTemplate() throws Exception {
 
		MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
		return mongoTemplate;
 
	}
}
