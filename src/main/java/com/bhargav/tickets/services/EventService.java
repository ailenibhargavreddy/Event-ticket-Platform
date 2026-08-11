package com.bhargav.tickets.services;

import com.bhargav.tickets.domain.CreateEventRequest;
import com.bhargav.tickets.domain.entities.Event;

import java.util.UUID;

public interface EventService {
    Event createEvent(UUID organizerId, CreateEventRequest event);
}
