package com.company;

import javax.print.DocFlavor;

public final class Dog extends Pet {
    private String name;
    private String breed;
    private String comands;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getComands() {
        return comands;
    }

    public void setComands(String comands) {
        this.comands = comands;
    }

    public Dog() {
    }

    public Dog(String name, String breed, Color color, Shelter shelter) {
        super(color, shelter);
        this.name = name;
        this.breed = breed;
    }
    public Dog(String name,String breed, Color color, Shelter shelter,String comands ){
        super(color,shelter);
        this.name = name;
        this.breed = breed;
        this.comands = comands;
    }
    public void makeVoice() {
        System.out.println("Гав-гав");
    }

    public void makeVoice(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("Гав-гав ");
        }
        System.out.println();
    }

    public void makeVoice(String voice) {
        System.out.println(voice);
    }

    public void makeVoice(String voice, int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(voice + " ");
        }
        System.out.println();
    }
    public final String getInfo(){
        return "Кличка - " + name + "порода - " + breed + "команда - " + comands + super.getInfo();
    }
}
