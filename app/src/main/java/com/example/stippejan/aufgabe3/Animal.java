package com.example.stippejan.aufgabe3;

public class Animal {
    int speciesStringId;
    int genderDrawableId;
    int drawableId;
    int age;

    /**
     * Constructor to create Animal-objects
     * @param speciesStringId Id that references the string of the species
     * @param genderDrawableId Id that references a drawable to indicate the gender
     * @param drawableId Id that references a drawable that shows the animal
     * @param age Age of the animal
     */
    public Animal(int speciesStringId, int genderDrawableId, int drawableId, int age) {
        this.speciesStringId = speciesStringId;
        this.genderDrawableId = genderDrawableId;
        this.drawableId = drawableId;
        this.age = age;
    }

    // Getter- and Setter-Methods
    public int getSpeciesStringId() {
        return speciesStringId;
    }

    public void setSpeciesStringId(int speciesStringId) {
        this.speciesStringId = speciesStringId;
    }

    public int getGenderDrawableId() {
        return genderDrawableId;
    }

    public void setGenderDrawableId(int genderDrawableId) {
        this.genderDrawableId = genderDrawableId;
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
