package com.example.demo.Reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Organizer;

@Repository
public interface OrganizerRepo extends  JpaRepository<Organizer, Long>{

}
