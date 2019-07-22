package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Джек, ", "дворняга, ", Color.GRAY, new Shelter("Priut, ",
                "Gde-to, "), "сидеть ");
        Dog dog2 = new Dog("Рекс, ", "алабай, ", Color.BLACK, new Shelter("Приют, ", "Где-то, "),
                "лежать ");
        Dog dog3 = new Dog("Дружок, ", "овчарка, ", Color.BROWN, new Shelter("Happy Dog, ", "ХЗ, "),
                "голос ");


        System.out.println(dog1.getInfo());
        dog1.setAge(3);
        dog1.makeVoice();
        System.out.println(dog2.getInfo());
        dog1.setAge(2);
        dog2.makeVoice(2);
        System.out.println(dog3.getInfo());
        dog1.setAge(6);
        dog3.makeVoice(3);

        System.out.println("_____ДЗ____");

        Shelter shelter1 = new Shelter("Новый приют, ", "проспект Неизвестный, ");
        Shelter shelter2 = new Shelter("Приют еще новее, ", "улица где-то, ");


        Dog dog4 = new Dog();
        Dog dog5 = new Dog("Пес, ", "дворняжка, ", Color.WHITE, shelter1);
        Dog dog6 = new Dog("Песель, ", "Хаски, ", Color.GRAY, shelter2, "умри, ");


        System.out.println(dog5.getInfo());
        dog5.setAge(4);
        dog5.makeVoice(4);

        System.out.println(dog6.getInfo());
        dog6.setAge(2);
        dog6.makeVoice(3);



    }
}
