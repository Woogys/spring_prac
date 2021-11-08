package com.sparta.myinfo.controller;

import com.sparta.myinfo.domain.Person;
import com.sparta.myinfo.domain.PersonRepository;
import com.sparta.myinfo.models.PersonRequestDto;
import com.sparta.myinfo.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
public class PersonController {

    private final PersonRequestDto PersonRepository;
    private final PersonService PersonService;

    @GetMapping("/api/info")
    public Person getPerson() {
        Person person = new Person();
        person.setName("손흥민");
        person.setAddress("런던");
        person.setAge(28);
        person.setJob("대한민국 축구선수");
        return person;
    }

    @PostMapping("/api/info")
    public Person createPerson(@RequestBody PersonRequestDto requestDto) {
        Person person = new Person(requestDto);
        return PersonRepository.save(Person);
    }

    @PutMapping("/api/info/{id}")
    public Long updatePerson(@PathVariable Long id, @RequestBody PersonRepository requestDto) {
        PersonService.update(id, requestDto);
        return id;
    }

    @DeleteMapping("/api/info/{id}")
    public Long deletePerson(@PathVariable Long id) {
        PersonRepository.deleteById(id);
        return id;
    }
}
