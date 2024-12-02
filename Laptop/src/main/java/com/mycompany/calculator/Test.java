package com.mycompany.calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Creeaza un obiect scanner ca sa citeasca din consola

        ArrayList<Calculator> vectorCalculatoare = new ArrayList<>();
        ArrayList<Laptop> vectorLaptopuri = new ArrayList<>();
        ArrayList<AccesoriiLaptop> vectorAccesorii = new ArrayList<>(); //Creeaza 3 liste pentru Calculator, Laptop si Accesorii Laptop(cate 1 fiecare)

        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator("HP", "Pavilion");
        Calculator calc3 = new Calculator(calc2); //Creeaza 3 instante al obiectului Calculator

        System.out.println("Calculator 1 (fără argumente): " + calc1);
        System.out.println("Calculator 2 (cu argumente): " + calc2);
        System.out.println("Calculator 3 (copie): " + calc3); //Afiseaza instantele cu metoda toString
        System.out.println();

        for (int i = 0; i < 10; i++) { //Este un for care merge de la 0-9
            vectorCalculatoare.add(new Calculator("Marca" + (i + 1), "Model" + (i + 1)));
        }

        System.out.println("Vector Calculatoare:");
        for (Calculator calc : vectorCalculatoare) {
            System.out.println(calc);
        }

        System.out.println("\nFiltrare Calculatoare dupa marca:");
        System.out.print("Introduceti marca dorita: ");
        String marcaCautata = scanner.nextLine();
        for (Calculator calc : vectorCalculatoare) {
            if (calc.getMarca().equals(marcaCautata)) {
                System.out.println(calc);
            }
        }

        System.out.println("\nFiltrare Calculatoare dupa model:");
        System.out.print("Introduceti modelul dorit: ");
        String modelCautat = scanner.nextLine();
        for (Calculator calc : vectorCalculatoare) {
            if (calc.getModel().equals(modelCautat)) {
                System.out.println(calc);
            }
        }
        System.out.println();

        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop("Lenovo", "ThinkPad", 14.0f, 10, true, "1920x1080", "Windows 11");
        Laptop laptop3 = new Laptop(laptop2);

        System.out.println("Laptop 1 (fara argumente): " + laptop1);
        System.out.println("Laptop 2 (cu argumente): " + laptop2);
        System.out.println("Laptop 3 (copie): " + laptop3);
        System.out.println();

        for (int i = 0; i < 10; i++) {
            vectorLaptopuri.add(new Laptop(
                    "Marca" + (i + 1),
                    "Model" + (i + 1),
                    13.3f + i,
                    6 + i,
                    i % 2 == 0,
                    "1920x1080",
                    "Windows 10"
            ));
        }

        System.out.println("Vector Laptopuri:");
        for (Laptop laptop : vectorLaptopuri) {
            System.out.println(laptop);
        }

        System.out.println("\nFiltrare Laptopuri după diagonala minima:");
        System.out.print("Introduceti diagonala minima dorita: ");
        float diagonalaMinima = scanner.nextFloat();
        for (Laptop laptop : vectorLaptopuri) {
            if (laptop.getDiagonalaEcran() >= diagonalaMinima) {
                System.out.println(laptop);
            }
        }

        System.out.println("\nFiltrare Laptopuri dupa durata bateriei:");
        System.out.print("Introduceți durata minima a bateriei: ");
        int durataMinima = scanner.nextInt();
        for (Laptop laptop : vectorLaptopuri) {
            if (laptop.getDurataBaterie() >= durataMinima) {
                System.out.println(laptop);
            }
        }
        System.out.println();

        AccesoriiLaptop accesoriu1 = new AccesoriiLaptop();
        AccesoriiLaptop accesoriu2 = new AccesoriiLaptop("Mouse Wireless", 120.0, true, laptop2);
        AccesoriiLaptop accesoriu3 = new AccesoriiLaptop(accesoriu2);

        System.out.println("Accesoriu 1 (fara argumente): " + accesoriu1);
        System.out.println("Accesoriu 2 (cu argumente): " + accesoriu2);
        System.out.println("Accesoriu 3 (copie): " + accesoriu3);
        System.out.println();

        for (int i = 0; i < 10; i++) {
            vectorAccesorii.add(new AccesoriiLaptop(
                    "Accesoriu" + (i + 1),
                    100.0 + i * 10,
                    i % 2 == 0,
                    laptop2
            ));
        }

        System.out.println("Vector AccesoriiLaptop:");
        for (AccesoriiLaptop accesoriu : vectorAccesorii) {
            System.out.println(accesoriu);
        }

        System.out.println("\nFiltrare AccesoriiLaptop compatibile cu marca laptopului:");
        System.out.print("Introduceti marca laptopului: ");
        scanner.nextLine(); 
        String marcaLaptop = scanner.nextLine();
        for (AccesoriiLaptop accesoriu : vectorAccesorii) {
            if (accesoriu.getLaptopCompatibil().getMarca().equals(marcaLaptop)) {
                System.out.println(accesoriu);
            }
        }

        System.out.println("\nFiltrare AccesoriiLaptop wireless:");
        for (AccesoriiLaptop accesoriu : vectorAccesorii) {
            if (accesoriu.isWireless()) {
                System.out.println(accesoriu);
            }
        }

        scanner.close();
    }
}