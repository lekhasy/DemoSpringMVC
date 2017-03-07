package io.zamo.demoSpringMVC.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.zamo.demoSpringMVC.domain.entities.Greeting;

@RestController
public class GreetingController {

	private AtomicLong counter = new AtomicLong();
	
	public GreetingController(){
		
	}

    @RequestMapping(path="/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
    	return new Greeting(counter.getAndIncrement(), name);
    }
}