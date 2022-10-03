package com.hillel.kryvoshei.homework.homework16;

 public class Androids implements Smartphones, LinuxOs  {
    @Override
    public void call() {
       System.out.println("call from Android");
    }

    @Override
    public void sms() {
       System.out.println("sms from Android");
    }

    @Override
    public void internet() {
       System.out.println("internet from Android");
    }

    @Override
    public void getLinuxOs() {
       System.out.println("getLinuxOs from Android");
    }
    public Androids(String name) {
       super();
    }
 }
