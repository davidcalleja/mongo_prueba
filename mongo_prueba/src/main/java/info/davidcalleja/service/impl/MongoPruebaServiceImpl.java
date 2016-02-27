package info.davidcalleja.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.davidcalleja.model.dto.UsuarioDTO;
import info.davidcalleja.model.entity.Usuario;
import info.davidcalleja.repository.MongoPruebaDAO;
import info.davidcalleja.service.MongoPruebaService;

@Service("mongoPruebaService")
public class MongoPruebaServiceImpl implements MongoPruebaService {
	
	@Autowired
	MongoPruebaDAO mongoPruebaDAO;

	public void save(UsuarioDTO user) throws Exception {
		mongoPruebaDAO.saveOrUpdate(transformUsuario(user));
	}

	public UsuarioDTO find(String id) throws Exception {
		return transformUsuarioDTO(mongoPruebaDAO.find(id));
	}
	
	// Para esto mejor dozerMapper
	private Usuario transformUsuario(UsuarioDTO usuarioDTO) {
		return new Usuario(usuarioDTO.getNombre(), usuarioDTO.getCalle());
	}
	
	// Para esto mejor dozerMapper
	private UsuarioDTO transformUsuarioDTO(Usuario usuario) {
		return new UsuarioDTO(usuario.getNombre(), usuario.getCalle());
	}
}
