package com.sparta.myinfo.domain;

import com.sparta.myinfo.models.PersonRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity

public class Person extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String job;

    @Column(nullable = false)
    private String age;

    @Column(nullable = false)
    private String address;

    public String getName() {
        return this.name;
    }

    public String getJob() {
        return this.job;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
