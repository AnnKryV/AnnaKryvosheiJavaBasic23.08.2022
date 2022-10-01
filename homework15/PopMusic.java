package com.hillel.kryvoshei.homework.homework15;

public class PopMusic extends MusicStyles{

    public PopMusic(String name) {
        super(name);
    }

    @Override
    void playMusic() {
        System.out.println("Playing pop music: " + name);
    }
}
