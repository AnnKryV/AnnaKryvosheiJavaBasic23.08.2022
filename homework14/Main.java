package com.hillel.kryvoshei.homework.homework14;

public class Main {
    /*
Зробіть програму для фітнес трекера, яка реєструватиме нового користувача створюючи йому
обліковий запис, приймаючи наступні параметри:
Незмінні (задаються тільки при створенні облікового запису, і можуть бути отримані
 лише за допомогою гетерів):
Ім'я
Дата народження (окремо день, місяць, рік)
Емейл
Телефон
Змінювані:
Прізвище
Вага
Тиск
Кількість пройдених за день кроків

Створювати кожного користувача необхідно через конструктор, беручи всі поля на вхід конструктора.
Додати метод printAccountInfo(), при виклику якого друкувати всі дані про користувача
Після прийому року народження - вираховувати вік користувача у внутрішню змінну age
(відштовхуючись просто від 2020 року, ускладнювати тут не будемо), на яку зробити тільки геттер
і виводити на екран разом з іншими полями в методі printAccountInfo(); у конструкторі або
геттерах/сеттерах не використовуємо виведення в консоль.
У main-класі створити 3-5 користувачів та роздрукувати дані кожного через виклик методу
 printAccountInfo(); для двох користувачів змінити кілька полів та роздрукувати нові дані повторно
    */ private final String name;
    private final int birthDay;
    private final int birthMounth;
    private final int birthYear;
    private final String email;
    private final String phoneNumber;
    private  String surname;
    private  double weight;
    private final int age;

    public Main(String name, int birthDay, int birthMounth, int birthYear, String email, String phoneNumber, String surname, double weight) {
        this.name = name;
        this.birthDay = birthDay;
        this.birthMounth = birthMounth;
        this.birthYear = birthYear;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.surname = surname;
        setWeight(weight);
        age = 2020 - birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMounth() {
        return birthMounth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0) {
            System.out.println("Wrong data!");
        } else {
            this.weight = weight;
        }
    }

    public int getAge() {
        return age;
    }


    void printAccountInfo() {
        String stringBuilder = "Person :" + "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", birthMounth=" + birthMounth +
                ", birthYer=" + birthYear +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber +
                '\'' + ", surname='" + surname +
                '\'' + ", weight=" + weight;

        System.out.println(stringBuilder);

    }

    @Override
    public String toString() {
        return "Person :" +
                "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", birthMounth=" + birthMounth +
                ", birthYear=" + birthYear +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", surname='" + surname + '\'' +
                ", weight=" + weight;
    }

}
