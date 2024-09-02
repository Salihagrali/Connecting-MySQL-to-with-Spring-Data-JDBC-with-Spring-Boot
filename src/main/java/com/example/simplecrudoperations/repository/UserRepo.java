package com.example.simplecrudoperations.repository;

import com.example.simplecrudoperations.model.Users;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface UserRepo extends CrudRepository<Users, Long> {

    @Modifying
    @Query("INSERT INTO users (name,logged_in,comment) VALUES (:name,:logged_in,:comment)")
    void insertNewLogIn(String name, LocalDateTime logged_in, String comment);

    @Query("Select * from users")
    List<Users> findAllUsers();

    @Query("Select name from users")
    List<String> getAllUserNames();

}
