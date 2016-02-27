package info.davidcalleja.repository;

import info.davidcalleja.model.entity.Usuario;

public interface MongoPruebaDAO {

	void saveOrUpdate(Usuario usuario) throws Exception;
	
	Usuario find(String id) throws Exception;
}
