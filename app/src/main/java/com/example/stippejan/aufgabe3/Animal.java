package com.example.stippejan.aufgabe3;

public class Animal {
    int speciesStringId;
    int drawableId;
    int age;

    public Animal(int speciesStringId, int drawableId, int age) {
        this.speciesStringId = speciesStringId;
        this.drawableId = drawableId;
        this.age = age;
    }

    public int getSpeciesStringId() {
        return speciesStringId;
    }

    public void setSpeciesStringId(int speciesStringId) {
        this.speciesStringId = speciesStringId;
    }

    public int getDrawableId() {
        return drawableId;
    }

    public void setDrawableId(int drawableId) {
        this.drawableId = drawableId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}