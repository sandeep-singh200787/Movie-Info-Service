package com.movieinfo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieinfo.dto.Movie;

@RestController
public class MovieController {
	
	@GetMapping("/movieinfo")
	public Movie getMovie() {
		return new Movie("101", "Avengers", "Thanos wiped out half of the world");
	}

}
