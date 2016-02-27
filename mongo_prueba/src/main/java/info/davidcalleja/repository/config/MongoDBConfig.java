package info.davidcalleja.repository.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;

@Configuration
public class MongoDBConfig {

	@Value("${mongodb.host}")
	private String mongoHost;
	
	@Value("${mongodb.port}")
	private Integer mongoPort;
	
	@Value("${mongodb.name}")
	private String database;
	
	@Value("${mongodb.user}")
	private String user;
	
	@Value("${mongodb.password}")
	private String password;
	
	@Bean
	public MongoDbFactory getMongoDbFactory() throws Exception {
		return new SimpleMongoDbFactory(new MongoClient(mongoHost, mongoPort), database);
	}
	
	@Bean
	public MongoTemplate getMongoTemplate() throws Exception {
		return new MongoTemplate(getMongoDbFactory());
	}
}