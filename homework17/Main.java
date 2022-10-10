package com.hillel.kryvoshei.homework.homework17;

/*
    Інструменти для використання:

1) enum (напої)

2) константи (ціни)

3) static (загальна вартість)

4) switch (вибір напою)

#5 Зробіть switch-case оператор, який буде робити напій (викликаючи відповідний метод) в залежності від вибору клієнта;

#6 Додайте можливість вибору напою для користувача і залежно від вибору робіть йому напій;

#7 Користувач повинен мати можливість замовити кілька напоїв

#8 І насамкінець клієнт має побачити, скільки грошей він повинен заплатити;
     */
    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {

        private static Scanner scanner = new Scanner(System.in);
        private static int totalPrice = 0;

        public static void main(String[] args) {
            run();
            System.out.println("Total count: " + Check.count);
            System.out.println("Total price: " + totalPrice);
            scanner.close();
        }

        private static void run() {
            System.out.println("You can buy: " + Arrays.toString(DrinkMachine.values()));

            while (true) {
                DrinkMachine drinksMachine = getDrinkType();
                if (drinksMachine == null) {
                    return;
                }

                String str = "You choose: %s, price: %s";
                switch (drinksMachine) {
                    case COFFEE : {
                        System.out.println(String.format(str, drinksMachine.getTitle(), Drinks.COFFEE_PRICE));
                        DrinkMaker.makeDrink(drinksMachine);
                        totalPrice += Drinks.COFFEE_PRICE;
                        break;
                    }
                    case LEMONADE:  {
                        System.out.println(String.format(str, drinksMachine.getTitle(), Drinks.LEMONADE_PRICE));
                        DrinkMaker.makeDrink(drinksMachine);
                        totalPrice += Drinks.LEMONADE_PRICE;
                        break;
                    }
                    case COCA_COLA:  {
                        System.out.println(String.format(str, drinksMachine.getTitle(), Drinks.COLA_PRICE));
                        DrinkMaker.makeDrink(drinksMachine);
                        totalPrice += Drinks.COLA_PRICE;
                        break;
                    }
                    case MOJITO:  {
                        System.out.println(String.format(str, drinksMachine.getTitle(), Drinks.MOJITO_PRICE));
                        DrinkMaker.makeDrink(drinksMachine);
                        totalPrice += Drinks.MOJITO_PRICE;
                        break;
                    }
                    case MINERAL_WATER:  {
                        System.out.println(String.format(str, drinksMachine.getTitle(), Drinks.MOJITO_PRICE));
                        DrinkMaker.makeDrink(drinksMachine);
                        totalPrice += Drinks.MOJITO_PRICE;
                        break;
                    }
                    case TEA : {
                        System.out.println(String.format(str, drinksMachine.getTitle(), Drinks.TEA_PRICE));
                        DrinkMaker.makeDrink(drinksMachine);
                        totalPrice += Drinks.TEA_PRICE;
                        break;
                    }

                }
            }
        }

        private static DrinkMachine getDrinkType() {
            System.out.println("Please choose drink or type \"stop\"");

            while (true) {
                String str = scanner.next().toUpperCase();

                if (str.equals("STOP")) {
                    return null;
                }

                for (DrinkMachine value : DrinkMachine.values()) {
                    if (str.equals(value.toString())) {
                        return DrinkMachine.valueOf(str);
                    }
                }
                System.out.println("Please choose drink from list " + Arrays.toString(DrinkMachine.values()));


            }
        }

    }

