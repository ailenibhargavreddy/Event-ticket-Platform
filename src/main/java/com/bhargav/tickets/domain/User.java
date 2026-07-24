package com.bhargav.tickets.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="users")
public class User {
    @Id
    private UUID id;
    @Column(name="name",nullable = false,updatable = false)
    private String name;
    @Column(name = "email",nullable = false)
    private String email;
    //TODO: Organized events
    //TODO:  Attending events
    //TODO: Staffing events
    @CreatedDate
    @Column(name="create_at",updatable = false,nullable = false)
    private LocalDateTime createdAt;
    @LastModifiedDate
    @Column(name="updated_at",nullable = false)
    private LocalDateTime updated;
}
