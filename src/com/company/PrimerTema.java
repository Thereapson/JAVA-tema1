package com.company;

import java.util.Scanner;

public class PrimerTema {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        String name = scanner.nextLine();         //String

        System.out.println("Introduce un id (1-10)");
        int id = scanner.nextInt();             //int

        System.out.println("Introduce un teléfono (máximo 9 caracteres)");
        Long phone = scanner.nextLong();         //long

        System.out.println("Introduce tu altura (en metros)");
        Double height = scanner.nextDouble();

        System.out.println("eres estudiante (true/false)");
        Boolean student = scanner.nextBoolean();

        System.out.println(name);
        System.out.println(id);
        System.out.println(phone);
        System.out.println(height);
        System.out.println(student);


    }
}
