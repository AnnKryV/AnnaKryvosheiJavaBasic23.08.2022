package com.hillel.kryvoshei.homework.homework16;

  public class iPhones implements Smartphones, IOS {

    @Override
    public void call() {
       System.out.println("Calling from iPhone");
    }

    @Override
    public void sms() {
       System.out.println("Sms from iPhone");
    }

    @Override
    public void internet() {
       System.out.println("internet from iPhone");
    }

    @Override
    public void getIOS() {
       System.out.println("getIOS from iPhone");
    }
     public iPhones(String name) {
        super();
     }
 }
