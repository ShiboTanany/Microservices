package com.microservice.test.limitservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {
	@GetMapping("/limits")
	public limitConfiguration getLimitConfiguration() {
		
		return new limitConfiguration(656, 56);
	}

}
