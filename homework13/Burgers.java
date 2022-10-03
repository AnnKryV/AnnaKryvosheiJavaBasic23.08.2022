package com.hillel.kryvoshei.homework.homework13;

public class Burgers {

    String cheese;
    String meat;
    boolean isDoubleMeat;

    public Burgers(String cheese, String meat) {
        this.cheese = cheese;
        this.meat = meat;
        this.isDoubleMeat = isDoubleMeat;
        System.out.println(this);
    }

    public Burgers(String cheese, String meat, boolean isDoubleMeat) {

        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Burgers{" +
                "cheese='" + cheese + '\'' +
                ", meat='" + meat + '\'' +
                " count='" + (isDoubleMeat ? 2 : 1) + '\'' +
                '}';

    }
}
