package com.hillel.kryvoshei.homework.homework16;

import javax.xml.namespace.QName;

public class Main {
    /*Зробіть інтерфейс Smartphones, який має містити методи call(), sms(), internet()
    Зробіть класи, які його імплементують: Androids, iPhones.
    Андроїди повинні також імплементувати LinuxOS, айфони повинні імплементувати iOS
    Створіть екземпляри кожного виду у мейн-класі*/


    iPhones iPhones = new iPhones(){
     iPhones.call();
     iPhones.sms();
     iPhones.internet();
     iPhones.getIOS();

    };
    Androids Androids = new Androids(){
        Androids.call();
        Androids.sms();
        Androids.internet();
        Androids.getLinuxOs();
    };
}
