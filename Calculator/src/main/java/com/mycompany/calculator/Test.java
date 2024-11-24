/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        // Creare instanțe pentru Calculator
        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator("HP", "Pavilion");
        Calculator calc3 = new Calculator(calc2);

        System.out.println("Calculator 1 (fara argumente): " + calc1);
        System.out.println("Calculator 2 (cu argumente): " + calc2);
        System.out.println("Calculator 3 (copie): " + calc3);
        System.out.println();

        // Creare și afișare vector de calculatoare
        calc2.creareVector();
        calc2.afisareVector();

        // Filtrare Calculatoare
        System.out.println("\nFiltrare Calculatoare dupa marca introdusa:");
        calc2.afisareVectorConditieMarcaCeruta();

        System.out.println("\nFiltrare Calculatoare dupa modelul introdus:");
        calc2.afisareVectorConditieModelCerut();
        System.out.println();

        // Creare instanțe pentru Desktop
        Desktop desktop1 = new Desktop();
        Desktop desktop2 = new Desktop("Dell", "XPS", (byte) 16, (short) 512, "ATX", "MSI", true);
        Desktop desktop3 = new Desktop(desktop2);

        System.out.println("Desktop 1 (fara argumente): " + desktop1);
        System.out.println("Desktop 2 (cu argumente): " + desktop2);
        System.out.println("Desktop 3 (copie): " + desktop3);
        System.out.println();

        // Creare și afișare vector de desktopuri
        desktop2.creareVector();
        desktop2.afisareVector();

        // Filtrare Desktop-uri
        System.out.println("\nFiltrare Desktop-uri dupa marca introdusa:");
        desktop2.afisareVectorConditieMarcaCeruta();

        System.out.println("\nFiltrare Desktop-uri dupa modelul introdus:");
        desktop2.afisareVectorConditieModelCerut();
        System.out.println();

        // Creare instanțe pentru Server
        Server server1 = new Server();
        Server server2 = new Server("HP", "ProLiant", 10, "Intel Xeon", 3.5f, (short) 64);
        Server server3 = new Server(server2);

        System.out.println("Server 1 (fara argumente): " + server1);
        System.out.println("Server 2 (cu argumente): " + server2);
        System.out.println("Server 3 (copie): " + server3);
        System.out.println();

        // Creare și afișare vector de servere
        server2.creareVector();
        server2.afisareVector();

        // Filtrare Servere
        System.out.println("\nFiltrare Servere dupa marca introdusa:");
        server2.afisareVectorConditieMarcaCeruta();

        System.out.println("\nFiltrare Servere dupa modelul introdus:");
        server2.afisareVectorConditieModelCerut();
    }
}
