package info.davidcalleja.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import info.davidcalleja.model.entity.Usuario;
import info.davidcalleja.repository.MongoPruebaDAO;
import info.davidcalleja.repository.config.MongoDBConfig;

@Repository
public class MongoPruebaDAOImpl implements MongoPruebaDAO {
	
	@Autowired
	MongoDBConfig mongoDBConfig;

	public void saveOrUpdate(Usuario usuario) throws Exception {
		mongoDBConfig.getMongoTemplate().save(usuario);
	}

	public Usuario find(String id) throws Exception {
		final Query query = new Query();
		query.addCriteria(new Criteria("nombre").is(id));
		return mongoDBConfig.getMongoTemplate().findOne(query, Usuario.class);
	}


}
