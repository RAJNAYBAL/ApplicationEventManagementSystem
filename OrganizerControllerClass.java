package com.example.demo.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entity.Organizer;
import com.example.demo.Service.OrganizerService;

import java.util.List;

@RestController
@RequestMapping("/api/organizers")
public class OrganizerControllerClass {
    @Autowired
    private OrganizerService organizerService;

    @PostMapping
    public ResponseEntity<Organizer> createOrganizer(@RequestBody Organizer organizer) {
        Organizer createdOrganizer = organizerService.createOrganizer(organizer);
        return new ResponseEntity<>(createdOrganizer, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Organizer>> getAllOrganizers() {
        List<Organizer> organizers = organizerService.getAllOrganizers();
        return new ResponseEntity<>(organizers, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Organizer> getOrganizerById(@PathVariable Long id) {
        Organizer organizer = organizerService.getOrganizerById(id);
        if (organizer != null) {
            return new ResponseEntity<>(organizer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Organizer> updateOrganizer(@PathVariable Long id, @RequestBody Organizer organizer) {
        Organizer updatedOrganizer = organizerService.updateOrganizer(id, organizer);
        if (updatedOrganizer != null) {
            return new ResponseEntity<>(updatedOrganizer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrganizer(@PathVariable Long id) {
        organizerService.deleteOrganizer(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
