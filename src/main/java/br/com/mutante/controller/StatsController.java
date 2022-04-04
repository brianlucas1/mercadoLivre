package br.com.mutante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.mutante.model.StatsModel;
import br.com.mutante.service.StatsService;


@RestController
public class StatsController {

	@Autowired
	StatsService statsService;
	
	@RequestMapping(value="/stats", method= RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public  StatsModel getStats(){
		
		StatsModel stats;
		
		stats = statsService.getStats();
		
		return stats;
		
	}
	
	
}
