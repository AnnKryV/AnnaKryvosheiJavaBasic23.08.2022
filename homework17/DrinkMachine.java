package com.hillel.kryvoshei.homework.homework17;

public enum DrinkMachine {
    /*#1 зробіть enum DrinksMachine, який вміє робити КАВУ, ЧАЙ, ЛИМОНАД, МОХІТО, МИНЕРАЛКУ, КОКА_КОЛУ; +*/

    COFFEE("Coffee"),
    LEMONADE("Lemonade"),
    TEA("Tea"),
    MINERAL_WATER("Mineral water"),
    COCA_COLA("Coca-cola"),
    MOJITO("Mojito");


    private String title;

    DrinkMachine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
