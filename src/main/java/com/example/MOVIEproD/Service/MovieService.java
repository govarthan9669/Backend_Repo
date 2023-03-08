package com.example.MOVIEproD.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.MOVIEproD.Entity.Moviereview;
import com.example.MOVIEproD.Repository.MovieRepo;



@Service
public class MovieService {
	@Autowired
	MovieRepo e;
	
	//add details
	public String add(Moviereview m) {
		e.save(m);
		return "Added";
	}
	
	//get details
	public List<Moviereview> getDetail(){
		return e.findAll();
	}
	
	//update details
	public  Moviereview updateDetail(Moviereview e1) {
		return e.saveAndFlush(e1);
	}
	
	//delete details	

	public void deleteDetail(int movieid) {
		e.deleteById(movieid);
	}
	
	

}