package com.example.simplecrudoperations.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDateTime;

@Data
public class Users {

    @Id
    private long user_id;

    private String name;
    @Column("logged_in")
    private LocalDateTime logged_in;
    private String comment;
}
