package com.hillel.kryvoshei.homework.homework3;

public class Main {
    /*Паралелепіпед:
Створити у новому класі main-метод;
Створити три змінні для зберігання сторін паралелепіпеда;
Порахувати обсяг у змінній volume;
Вивести на екран змінну volume у вигляді:
System.out.println("Об'єм паралелепіпеда = " + volume);
Порахувати сумарну довжину всіх сторін у змінній length та вивести її на екран;
*/
    public static void main(String[] args) {
        int len = 15;
        int h = 27;
        int wid = 24;

        var volume = len * h * wid;
        var length = (len + h + wid)*4;
        System.out.println("Об'єм паралелепіпеда = " + volume);
        System.out.println("Сумарна довжина всіх сторін:" + length);
    }
}
