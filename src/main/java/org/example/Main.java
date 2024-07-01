package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String firstName = scanner.next();
        System.out.println ("Введите возраст: ");
        Integer firstAge = scanner.nextInt();

        User firstUser = new User(firstName, firstAge);

        System.out.println("Введите второе имя: ");
        String secondName = scanner.next();
        System.out.println("Введите второй возраст: ");
        Integer secondAge = scanner.nextInt();

        User secondUser = new User(secondName,secondAge);

        if (firstAge < secondAge) {
            System.out.println(firstUser.toString());
        } else {
            System.out.println(secondUser.toString());
        }


    }
}