package com.example.demo.Reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Venue;

@Repository
public interface VenueRepo extends JpaRepository<Venue, Long> {

}
