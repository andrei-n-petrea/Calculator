/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;


public class Test {
    public static void main(String[] args) {
       
        Calculator calc1 = new Calculator();
       
        Calculator calc2 = new Calculator("HP", "Pavilion");
    
        Calculator calc3 = new Calculator(calc2);

       
        System.out.println("Calculator 1 (fără argumente): " + calc1);
        System.out.println("Calculator 2 (cu argumente): " + calc2);
        System.out.println("Calculator 3 (copie): " + calc3);
        System.out.println();

        
        calc2.creareVector();
        calc2.afisareVector();
        calc2.afisareVectorConditie1();
        calc2.afisareVectorConditie2();
        System.out.println();

      
        Desktop desktop1 = new Desktop();
       
        Desktop desktop2 = new Desktop("Dell", "XPS", (byte) 16, (short) 512, "ATX", "MSI", true);
       
        Desktop desktop3 = new Desktop(desktop2);

        
        System.out.println("Desktop 1 (fără argumente): " + desktop1);
        System.out.println("Desktop 2 (cu argumente): " + desktop2);
        System.out.println("Desktop 3 (copie): " + desktop3);
        System.out.println();

  
        desktop2.creareVector();
        desktop2.afisareVector();
        desktop2.afisareVectorConditie1();
        desktop2.afisareVectorConditie2();
        System.out.println();

       
        Server server1 = new Server();
      
        Server server2 = new Server("HP", "ProLiant", 10, "Intel Xeon", 3.5f, (short) 64);
       
        Server server3 = new Server(server2);

       
        System.out.println("Server 1 (fără argumente): " + server1);
        System.out.println("Server 2 (cu argumente): " + server2);
        System.out.println("Server 3 (copie): " + server3);
        System.out.println();

        
        server2.creareVector();
        server2.afisareVector();
        server2.afisareVectorConditie1();
        server2.afisareVectorConditie2();
    }
}
