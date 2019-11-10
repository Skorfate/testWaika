package cl.waika.vtr.waikitus.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.java.Log;

@RestController("/web")
@Log
public class web {
	
	@RequestMapping(value = "/test/{id}", method = RequestMethod.GET)
	public String test( @PathVariable("id") Long id) {
		
		log.info(id.toString());
		return "hola guapo waika";
	}
}
