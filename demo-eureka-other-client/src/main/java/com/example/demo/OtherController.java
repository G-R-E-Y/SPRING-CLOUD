package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OtherController {

	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/")
	public String  info()
	{
		String resp = restTemplate.getForObject("http://Account-Service",String.class);
		return resp + " called from other service";
	}
	
}
