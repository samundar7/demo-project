package com.jenkins.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("jenkins")
public class Jenkins {
	
	
	@GetMapping("/get")
	public ResponseEntity<String> getJenkins(){
		return new ResponseEntity<String>("JENKINS STATRED",HttpStatusCode.valueOf(200));
	}

}
