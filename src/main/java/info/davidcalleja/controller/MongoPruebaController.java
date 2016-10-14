package info.davidcalleja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import info.davidcalleja.model.dto.UsuarioDTO;
import info.davidcalleja.service.MongoPruebaService;

@Controller
@RequestMapping(value = "/mongoprueba/")
public class MongoPruebaController {
	
	@Autowired
	private MongoPruebaService mongoPruebaService;

	@RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
	@ResponseBody
	public UsuarioDTO find(@PathVariable(value = "id") String id) throws Exception {
		return mongoPruebaService.find(id);
	}
	
	@RequestMapping(value = "/save/", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public void save(@RequestBody UsuarioDTO user) throws Exception {
		mongoPruebaService.save(user);
	}
	
}
