package com.sujata.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.service.GreetService;

@RestController
public class GreetResource {
	
	@Autowired
	private GreetService greetService;
	
	@RequestMapping(path = "/greet",produces =MediaType.TEXT_PLAIN_VALUE,method = RequestMethod.GET)
	public String wishResource() {
		return "<h1>"+greetService.wish()+"</h1>";
	}

	@RequestMapping(path = "/wish",produces =MediaType.TEXT_HTML_VALUE,method = RequestMethod.GET)
	public String wishResourceOneMore() {
		return "<h1>"+greetService.wish()+"</h1>";
	}
	
	@RequestMapping(path = "/welcome/{na}",produces =MediaType.TEXT_HTML_VALUE,method = RequestMethod.GET)
	public String welcomeResource(@PathVariable("na") String name) {
		return "<h1>"+greetService.welcome(name)+"</h1>";
	}
}
