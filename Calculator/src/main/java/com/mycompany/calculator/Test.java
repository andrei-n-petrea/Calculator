/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;
public class Test {
    public static void main(String[] args) {
        Desktop desktop1 = new Desktop(); 
        Desktop desktop2 = new Desktop("Dell", "Inspiron", 16, 512, "ATX", "MSI", true); 
        Desktop desktop3 = new Desktop(desktop2); 
        System.out.println(desktop1);
        System.out.println(desktop2);
        System.out.println(desktop3);
        System.out.println();
        Server server1 = new Server(); 
        Server server2 = new Server("HP", "ProLiant", 1024, "EPYC", "WAN", "Windows Server", 500); 
        Server server3 = new Server(server2); 
        System.out.println(server1);
        System.out.println(server2);
        System.out.println(server3);
        System.out.println();
        AccesoriiLaptop mouse = new AccesoriiLaptop("Mouse wireless", 50.0);
        AccesoriiLaptop husa = new AccesoriiLaptop("Husă laptop", 30.0);
        Laptop laptop1 = new Laptop(); 
        Laptop laptop2 = new Laptop("Asus", "ROG", 14, 16, mouse); 
        Laptop laptop3 = new Laptop(laptop2); 
        System.out.println(laptop1);
        System.out.println(laptop2);
        System.out.println(laptop3);
    }
}
