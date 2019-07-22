package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Джек", "дворняга", Color.GRAY, new Shelter("Priut", "Gde-to"), "сидеть");
        Dog dog2 = new Dog("Рекс", "алабай", Color.BLACK, new Shelter("Приют", "Где-то"), "лежать");
        Dog dog3 = new Dog("Дружок", "овчарка", Color.BROWN, new Shelter("Happy Dog", "ХЗ"), "голос");

        System.out.println(dog1.getInfo());
        dog1.setAge(3);
        dog1.makeVoice();
        System.out.println(dog2.getInfo());
        dog1.setAge(2);
        dog2.makeVoice(2);
        System.out.println(dog3.getInfo());
        dog1.setAge(6);
        dog3.makeVoice(3);

    }
}
