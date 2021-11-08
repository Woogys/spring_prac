package com.sparta.myinfo.domain;

import com.sparta.myinfo.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findAllByModifiedAtBetweenOrderByModifiedAtDesc(LocalDateTime start, LocalDateTime end);
}