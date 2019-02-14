package com.hersonalfaro.jx.jxsavedata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

	@Autowired
	private UpperCaseClient upperCaseClient;
	
	@GetMapping("/echo-in-upper-case")
	public String echo(@RequestParam(name="text") String text) {
		return upperCaseClient.upperCase(text);
	}
}
