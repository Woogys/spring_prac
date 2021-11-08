package com.sparta.item01;

import com.sparta.item01.domain.Lecture;
import com.sparta.item01.domain.LectureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Item01Application {

    public static void main(String[] args) {

        SpringApplication.run(Item01Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(LectureRepository lectureRepository) {
        return (args) -> {
            Lecture course = new Lecture("웹개발의 봄", "남병관");
            lectureRepository.save(course);
            lectureRepository.findAll();
        };
    }
}