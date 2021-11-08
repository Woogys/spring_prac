package com.sparta.item01.prac;

public class Tutor {
    private String name;
    private String bio;

    public Tutor() {
        this.name = "서태욱";
        this.bio = "3";
    }

    public Tutor(String name, String bio) {
        this.name = name;
        this.bio = bio;
    }

    public String getName() {
        return this.name;
    }

    public String getBio() {
        return this.bio;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
