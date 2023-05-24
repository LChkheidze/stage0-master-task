package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public Animal(){

    }

    public String getDescription(){
        String part1 = "This animal is mostly " + color;
        String part2 = (numberOfPaws==1)? ". It has " + numberOfPaws + " paw" : ". It has " + numberOfPaws + " paws";
        String part3 = (hasFur)? " and a fur." : " and no fur.";

        return part1 + part2 + part3;
    }
}
