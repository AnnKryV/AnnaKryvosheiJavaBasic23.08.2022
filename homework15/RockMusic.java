package com.hillel.kryvoshei.homework.homework15;

public class RockMusic extends MusicStyles{
    public RockMusic(String name) {
        super(name);
    }

    @Override
    void playMusic() {
        System.out.println("Playing rock music: " + name);
    }
}


