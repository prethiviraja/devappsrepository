package com.Devapps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
	
	@GetMapping(value="/getname")
	public String getname() {
		return "prethivi";
	}
}

	



