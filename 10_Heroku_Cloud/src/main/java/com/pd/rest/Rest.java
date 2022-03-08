package com.pd.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {
	@GetMapping("/book")
	public ResponseEntity<String> getBook() {
		return new ResponseEntity<String>("Welcome to Heroku Cloud !! Das is waiting..........", HttpStatus.OK);
	}

}
