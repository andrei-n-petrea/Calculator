package com.mycompany.calculator;

public class Test {
    public static void main(String[] args) {

        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator("HP", "Pavilion");
        Calculator calc3 = new Calculator(calc2);

        System.out.println("Calculator 1 (fara argumente): " + calc1);
        System.out.println("Calculator 2 (cu argumente): " + calc2);
        System.out.println("Calculator 3 (copie): " + calc3);
        System.out.println();

        calc2.creareVector();
        calc2.afisareVector();

        System.out.println("\nFiltrare Calculatoare dupa marca introdusa:");
        calc2.afisareVectorConditieMarcaCeruta();

        System.out.println("\nFiltrare Calculatoare dupa modelul introdus:");
        calc2.afisareVectorConditieModelCerut();
        System.out.println();

        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop("Lenovo", "ThinkPad", 14.0f, 10, true, "1920x1080", "Windows 11");
        Laptop laptop3 = new Laptop(laptop2);

        System.out.println("Laptop 1 (fara argumente): " + laptop1);
        System.out.println("Laptop 2 (cu argumente): " + laptop2);
        System.out.println("Laptop 3 (copie): " + laptop3);
        System.out.println();

        laptop2.creareVector();
        laptop2.afisareVector();

        System.out.println("\nFiltrare Laptopuri dupa diagonala minima dorita:");
        laptop2.afisareVectorConditieDiagonala();

        System.out.println("\nFiltrare Laptopuri dupa durata minima a bateriei:");
        laptop2.afisareVectorConditieDurata();
        System.out.println();

        AccesoriiLaptop accesoriu1 = new AccesoriiLaptop();
        AccesoriiLaptop accesoriu2 = new AccesoriiLaptop("Mouse Wireless", 120.0, true, laptop2);
        AccesoriiLaptop accesoriu3 = new AccesoriiLaptop(accesoriu2);

        System.out.println("Accesoriu 1 (fara argumente): " + accesoriu1);
        System.out.println("Accesoriu 2 (cu argumente): " + accesoriu2);
        System.out.println("Accesoriu 3 (copie): " + accesoriu3);
        System.out.println();

        accesoriu2.creareVector(laptop2);
        accesoriu2.afisareVector();

        System.out.println("\nFiltrare Accesorii pentru marca compatibilă:");
        accesoriu2.afisareVectorConditieMarcaCompatibila();

        System.out.println("\nFiltrare Accesorii wireless:");
        accesoriu2.afisareVectorConditieWireless();
    }
}