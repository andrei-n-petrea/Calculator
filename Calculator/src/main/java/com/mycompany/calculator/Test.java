/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;

public class Test {
    public static void main(String[] args) {
        // Crearea unui obiect Desktop fără parametri
        Desktop desktop1 = new Desktop(); 
        // Crearea unui obiect Desktop cu parametrii
        Desktop desktop2 = new Desktop("Dell", "Inspiron", 16, 512, "ATX", "MSI", true); 
        // Crearea unui obiect Desktop prin copiere
        Desktop desktop3 = new Desktop(desktop2); 

        // Afișarea detaliilor despre desktop-uri
        System.out.println(desktop1);
        System.out.println(desktop2);
        System.out.println(desktop3);
        System.out.println();

        // Crearea unui obiect Server fără parametri
        Server server1 = new Server(); 
        // Crearea unui obiect Server cu parametrii
        Server server2 = new Server("HP", "ProLiant", 1024, "EPYC", "WAN", "Windows Server", 500); 
        // Crearea unui obiect Server prin copiere
        Server server3 = new Server(server2); 

        // Afișarea detaliilor despre servere
        System.out.println(server1);
        System.out.println(server2);
        System.out.println(server3);
        System.out.println();

        // Crearea obiectelor pentru accesorii laptop
        AccesoriiLaptop mouse = new AccesoriiLaptop("Mouse wireless", 50.0);
        AccesoriiLaptop husa = new AccesoriiLaptop("Husă laptop", 30.0);
        
        // Crearea unui obiect Laptop fără parametri
        Laptop laptop1 = new Laptop(); 
        // Crearea unui obiect Laptop cu accesorii
        Laptop laptop2 = new Laptop("Asus", "ROG", 14, 16, mouse); 
        // Crearea unui obiect Laptop prin copiere
        Laptop laptop3 = new Laptop(laptop2); 

        // Afișarea detaliilor despre laptop-uri
        System.out.println(laptop1);
        System.out.println(laptop2);
        System.out.println(laptop3);
    }
}
