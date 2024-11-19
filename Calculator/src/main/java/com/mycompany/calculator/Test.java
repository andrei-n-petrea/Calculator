/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;
public class Test {
    public static void main(String[] args) {
        // Crearea unui obiect Calculator fără parametri
        Calculator calc1 = new Calculator();
        // Crearea unui obiect Calculator cu parametrii
        Calculator calc2 = new Calculator("HP", "Pavilion");
        // Crearea unui obiect Calculator prin copiere
        Calculator calc3 = new Calculator(calc2);

        // Afișarea detaliilor despre calculatoare
        System.out.println("Calculator 1 (fără argumente): " + calc1);
        System.out.println("Calculator 2 (cu argumente): " + calc2);
        System.out.println("Calculator 3 (copie): " + calc3);
        System.out.println();

        // Crearea unui obiect Desktop fără parametri
        Desktop desktop1 = new Desktop();
        // Crearea unui obiect Desktop cu parametrii
        Desktop desktop2 = new Desktop("Dell", "XPS", (byte) 16, (short) 512, "ATX", "MSI", true);
        // Crearea unui obiect Desktop prin copiere
        Desktop desktop3 = new Desktop(desktop2);

        // Afișarea detaliilor despre desktop-uri
        System.out.println("Desktop 1 (fără argumente): " + desktop1);
        System.out.println("Desktop 2 (cu argumente): " + desktop2);
        System.out.println("Desktop 3 (copie): " + desktop3);
        System.out.println();

        // Crearea unui obiect Server fără parametri
        Server server1 = new Server();
        // Crearea unui obiect Server cu parametrii
        Server server2 = new Server("HP", "ProLiant", 10, "Intel Xeon", 3.5f, (short) 64);
        // Crearea unui obiect Server prin copiere
        Server server3 = new Server(server2);

        // Afișarea detaliilor despre servere
        System.out.println("Server 1 (fără argumente): " + server1);
        System.out.println("Server 2 (cu argumente): " + server2);
        System.out.println("Server 3 (copie): " + server3);
        System.out.println();

        // Crearea unui obiect Laptop fără parametri
        Laptop laptop1 = new Laptop();
        // Crearea unui obiect Laptop cu parametrii
        Laptop laptop2 = new Laptop("Asus", "ZenBook", (short) 4000, 1.5f, true);
        // Crearea unui obiect Laptop prin copiere
        Laptop laptop3 = new Laptop(laptop2);

        // Afișarea detaliilor despre laptop-uri
        System.out.println("Laptop 1 (fără argumente): " + laptop1);
        System.out.println("Laptop 2 (cu argumente): " + laptop2);
        System.out.println("Laptop 3 (copie): " + laptop3);
        System.out.println();

        // Crearea unui obiect AccesoriiLaptop cu parametrii
        AccesoriiLaptop accesorii1 = new AccesoriiLaptop("Mouse wireless", false);
        AccesoriiLaptop accesorii2 = new AccesoriiLaptop("Husă laptop", true);
        
        // Crearea unui obiect Laptop cu accesorii
        Laptop laptop4 = new Laptop("Lenovo", "ThinkPad", (short) 5000, 1.8f, accesorii1);
        // Crearea unui obiect Laptop cu alt accesoriu
        Laptop laptop5 = new Laptop("HP", "Spectre", (short) 4500, 1.6f, accesorii2);

        // Afișarea detaliilor despre laptop-uri cu accesorii
        System.out.println("Laptop 4 (cu accesorii 1): " + laptop4);
        System.out.println("Laptop 5 (cu accesorii 2): " + laptop5);
    }
}
