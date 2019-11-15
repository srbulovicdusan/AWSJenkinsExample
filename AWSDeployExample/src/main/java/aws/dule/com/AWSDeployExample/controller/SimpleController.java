package aws.dule.com.AWSDeployExample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api")
public class SimpleController {
	@GetMapping
	public String a(){
		return "Hello world";
	}
}
