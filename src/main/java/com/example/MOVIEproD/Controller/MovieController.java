package com.example.MOVIEproD.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.MOVIEproD.Entity.Moviereview;
import com.example.MOVIEproD.Service.MovieService;



@RestController
@CrossOrigin
public class MovieController {
	@Autowired
	MovieService s;
	
	@GetMapping("/getmap")
	public List<Moviereview> showDetail(){
		return s.getDetail();
	}
	
	@PostMapping("/postmap")
	public String addDetail(@RequestBody Moviereview t) {
		s.add(t);
		return "Added details ";
	}
	
	@PutMapping("/putmap")
	public Moviereview updateInfo(@RequestBody Moviereview st) {
		return s.updateDetail(st);
	
	}

	@DeleteMapping("/deletemap/{movieid}")
	String deleteinfo(@PathVariable("empid") int movieid) {
		s.deleteDetail(movieid);
		return "Deleted the element";
	}
	

}