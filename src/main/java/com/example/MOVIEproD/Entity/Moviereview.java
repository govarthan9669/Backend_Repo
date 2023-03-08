package com.example.MOVIEproD.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="MovieDetail")
public class Moviereview {
	@Id
	private int movieid;
	private String moviename;
	private String moviegenre;
	private int movierating;
	
	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getMoviegenre() {
		return moviegenre;
	}

	public void setMoviegenre(String moviegenre) {
		this.moviegenre = moviegenre;
	}

	public int getMovierating() {
		return movierating;
	}

	public void setMovierating(int movierating) {
		this.movierating = movierating;
	}

	public Moviereview(int movieid, String moviename, String moviegenre, int movierating) {
		super();
		this.movieid = movieid;
		this.moviename = moviename;
		this.moviegenre = moviegenre;
		this.movierating = movierating;
	}

	public Moviereview() {
		
	}

}
