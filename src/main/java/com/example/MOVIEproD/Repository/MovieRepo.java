package com.example.MOVIEproD.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MOVIEproD.Entity.Moviereview;

public interface MovieRepo extends JpaRepository<Moviereview,Integer> {

}
