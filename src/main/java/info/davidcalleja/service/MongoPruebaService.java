package info.davidcalleja.service;

import info.davidcalleja.model.dto.UsuarioDTO;

public interface MongoPruebaService {

	void save(UsuarioDTO user) throws Exception;
	
	UsuarioDTO find(String id) throws Exception;
	
}
