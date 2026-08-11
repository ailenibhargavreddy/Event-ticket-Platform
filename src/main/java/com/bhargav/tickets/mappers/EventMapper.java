package com.bhargav.tickets.mappers;


import com.bhargav.tickets.domain.CreateEventRequest;
import com.bhargav.tickets.domain.CreateTicketTypeRequest;
import com.bhargav.tickets.domain.dtos.CreateEventRequestDto;
import com.bhargav.tickets.domain.dtos.CreateEventResponseDto;
import com.bhargav.tickets.domain.dtos.CreateTicketTypeRequestDto;
import com.bhargav.tickets.domain.entities.Event;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EventMapper {
    CreateTicketTypeRequest fromDto(CreateTicketTypeRequestDto dto);
    CreateEventRequest fromDto(CreateEventRequestDto dto);
    CreateEventResponseDto toDto(Event event);
}
