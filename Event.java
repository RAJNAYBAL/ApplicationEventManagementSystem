package com.example.demo.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class Event {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String eventName;
 private Date eventDate;
 private String description;

 
 @ManyToOne
 @JoinColumn(name = "venue_id")
 private Venue venue;
 
 @ManyToOne
 @JoinColumn(name = "organizer_id")
 private Organizer organizer;



public Event() {
	super();
	// TODO Auto-generated constructor stub
}
public Event(String eventName, Date eventDate, String description) {
	super();
	this.eventName = eventName;
	this.eventDate = eventDate;
	this.description = description;
}
public Organizer getOrganizer() {
	return organizer;
}

public void setOrganizer(Organizer organizer) {
	this.organizer = organizer;
}

public Venue getVenue() {
	return venue;
}

public void setVenue(Venue venue) {
	this.venue = venue;
}
public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getEventName() {
	return eventName;
}

public void setEventName(String eventName) {
	this.eventName = eventName;
}

public Date getEventDate() {
	return eventDate;
}

public void setEventDate(Date eventDate) {
	this.eventDate = eventDate;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}



@Override
public String toString() {
	return "Event [id=" + id + ", eventName=" + eventName + ", eventDate=" + eventDate + ", description=" + description
			+ "]";
}


}
