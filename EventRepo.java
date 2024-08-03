package com.example.demo.Reposistory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Event;

@Repository
public interface EventRepo extends JpaRepository<Event, Long> {

	List<Event> findByVenueId(Long venueId);

	List<Event> findByOrganizerId(Long organizerId);

}
