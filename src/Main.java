public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // homework
        // task 1
        System.out.println("Задача 1.");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        // task 2
        System.out.println("Задача 2.");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }


        // task 3
        System.out.println("Задача 3.");

        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }


        // task 4
        System.out.println("Задача 4.");

        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }


        // task 5
        System.out.println("Задача 5.");

        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным.");
        }

        // task 6
        System.out.println("Задача 6.");

        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }


        // task 7
        System.out.println("Задача 7.");

        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }


        // task 8
        System.out.println("Задача 8.");

        int savings = 29000;
        int totalSavings =0;
        for (int i = 1; i <= 12; i++) {
            totalSavings = totalSavings + savings;
            System.out.println("Месяц " + i + " - сумма накоплений равна " + totalSavings + " рублей.");
        }


        // task 9
        System.out.println("Задача 9.");

        int monthSavings = 29000;
        int savingsAccount = 0;
        for (int i = 1; i <= 12; i++) {
            savingsAccount = savingsAccount + savingsAccount / 100;
            savingsAccount = savingsAccount + monthSavings;
            System.out.println("Месяц " + i + " - сумма накоплений равна " + savingsAccount + " рублей.");
        }


        // task 10
        System.out.println("Задача 10.");

        int product;
        for (int i = 1; i <= 10; i++) {
            product = 2 * i;
            System.out.println("2 * " + i + " = " + product);
        }
    }
}