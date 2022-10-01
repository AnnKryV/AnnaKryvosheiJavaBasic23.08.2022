package com.hillel.kryvoshei.homework.homework15;

public class Main {
    public static void main(String[] args) {
        /*Зробіть клас MusicStyles, який міститиме метод playMusic() +
            Зробіть його спадкоємців: PopMusic, RockMusic і ClassicMusic. +
            Спадкоємці повинні реалізовувати метод playMusic(). +
            У мейн-класі створіть музичні гурти для кожного стилю +
            За допомогою методу for each викличте у всіх спадкоємців MusicStyles метод playMusic() 
            */
        MusicStyles[]  musics = {
            new PopMusic("The Beatles"),
            new RockMusic("Skillet"),
            new ClassicMusic("Garett")
        };


        for (MusicStyles music : musics) {
            music.playMusic();
        }
    }
}
