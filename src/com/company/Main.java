package com.company;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //  1. Приветствовать любого пользователя при вводе его имени через командную строку.

//        System.out.println("Enter your name");
//        Scanner scan  = new Scanner(System.in);
//        String name = scan.nextLine();
//        System.out.println("Hello " + name + " have a good day ;)" );

        // 2.     Отобразить в окне консоли аргументы командной строки в обратном порядке.

//        System.out.println("Введите аргументы ");
//        Scanner scan = new Scanner(System.in);
//        String enter = scan.nextLine();
//
//        String reverse = new StringBuffer(enter).reverse().toString();
//        System.out.print(" Аргументы в обратном порядке: " + reverse);

       // 3.     Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

//        System.out.println("Какое количество случайных чисел вам нужно? ");
//        Scanner scan = new Scanner(System.in);
//        int number  = scan.nextInt();
//        int n = 0;
//
//        for (int i = 0; number > 0; i++ ){
//            number--;
//            int random = (int) ( Math.random() * (100-0) ) + 0;
//             n  ++;
//
//            System.out.println("Случайное число № "+ n  +": " + random);
//        }

        // 4.     Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение)
        // и вывести результат на консоль.

//        System.out.println("Ведите первую цифру ");
//        Scanner scanOne = new Scanner(System.in);
//        int numberOne = scanOne.nextInt();
//        System.out.println("Введите вторую цифру ");
//        Scanner scanTwo = new Scanner(System.in);
//        int numberTwo = scanTwo.nextInt();
//        int sum = numberOne + numberTwo;
//        int product = numberOne * numberTwo;
//        System.out.println("Сумма введенных цифр равна: " + sum);
//        System.out.println("Произведение введенных цифр равно: "+ product);


//        5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному
//        числу. Осуществить проверку корректности ввода чисел.

        System.out.println("Введите порядковый номер месяца ");
        Scanner scanNumberMonth = new Scanner(System.in);
        int numberMonth = scanNumberMonth.nextInt();
        System.out.println(solve(numberMonth));
    }
        public static String solve(int numberMonth){
            String[] month = {" ","January","February","March","April","May","June","July","August","September","October","November","December"};
            if(numberMonth > 0 && numberMonth<month.length)
                return month[numberMonth];
            return "Month not found";
        }
                     }


