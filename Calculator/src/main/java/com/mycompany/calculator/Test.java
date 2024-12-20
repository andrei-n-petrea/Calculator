package com.mycompany.calculator;
import java.util.ArrayList;
import java.util.Scanner;
public class Test {

    public static void main(String[] args) {
        ArrayList<Calculator> vectorCalculatoare = new ArrayList<>();
        ArrayList<Desktop> vectorDesktopuri = new ArrayList<>();
        ArrayList<Server> vectorServere = new ArrayList<>();
        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator("HP", "Pavilion");
        Calculator calc3 = new Calculator(calc2);
        System.out.println("Calculator 1 (fara argumente): " + calc1);
        System.out.println("Calculator 2 (cu argumente): " + calc2);
        System.out.println("Calculator 3 (copie): " + calc3);
        System.out.println();
        for (int i = 0; i < 10; i++) {
            vectorCalculatoare.add(new Calculator("Marca" + (i + 1), "Model" + (i + 1)));
        }
   System.out.println("Vector Calculatoare:");
        for (Calculator calc : vectorCalculatoare) {
            System.out.println(calc);
        }
        Scanner scanner = new Scanner(System.in);
       // Filtrare Calculatoare după două conditii
        System.out.println("\nFiltrare Calculatoare dupa doua conditii:");
        System.out.print("Introduceti marca dorita: ");
        String marcaCautata = scanner.nextLine();
        System.out.print("Introduceti modelul dorit: ");
        String modelCautat = scanner.nextLine();

        System.out.println("\nCalculatoare care respecta conditiile:");
        for (Calculator calc : vectorCalculatoare) {
            if (calc.getMarca().equals(marcaCautata) && calc.getModel().equals(modelCautat)) {
                System.out.println(calc);
            }
        }
    Desktop desktop1 = new Desktop();
        Desktop desktop2 = new Desktop("Lenovo", "ThinkCentre", (byte) 16, (short) 512, "ATX", "Intel", true);
        Desktop desktop3 = new Desktop(desktop2);
        System.out.println("Desktop 1 (fara argumente): " + desktop1);
        System.out.println("Desktop 2 (cu argumente): " + desktop2);
        System.out.println("Desktop 3 (copie): " + desktop3);
        System.out.println();  
        for (int i = 0; i < 10; i++) {
            vectorDesktopuri.add(new Desktop(
                    "Marca" + (i + 1),
                    "Model" + (i + 1),
                    (byte) (8 + i),
                    (short) (500 + i * 50),
                    "ATX",
                    "MSI",
                    true
            ));
        }  
        System.out.println("Vector Desktopuri:");
        for (Desktop desktop : vectorDesktopuri) {
            System.out.println(desktop);
        }
  System.out.println("\nFiltrare Desktopuri dupa doua conditii:");
        System.out.print("Introduceti valoarea minima a RAM-ului (GB): ");
        byte ramMinim = Byte.parseByte(scanner.nextLine());

        System.out.print("Introduceti tipul de carcasa dorit: ");
        String carcasaCautata = scanner.nextLine();

        System.out.println("\nDesktopuri care respecta conditiile:");
        for (Desktop desktop : vectorDesktopuri) {
            if (desktop.getRam() >= ramMinim && desktop.getFormatCarcasa().equals(carcasaCautata)) {
                System.out.println(desktop);
            }
        }
    Server server1 = new Server();
        Server server2 = new Server("Dell", "PowerEdge", 2, "Xeon", 3.5f, (short) 64);
        Server server3 = new Server(server2);
     System.out.println("Server 1 (fara argumente): " + server1);
        System.out.println("Server 2 (cu argumente): " + server2);
        System.out.println("Server 3 (copie): " + server3);
        System.out.println();
    for (int i = 0; i < 10; i++) {
            vectorServere.add(new Server(
                    "Marca" + (i + 1),
                    "Model" + (i + 1),
                    i + 1,
                    "Procesor" + i,
                    2.5f + i,
                    (short) (16 + i * 4)
            ));
        }
      System.out.println("Vector Servere:");
        for (Server server : vectorServere) {
            System.out.println(server);
        }
   // Filtrare Servere după două conditii
        System.out.println("\nFiltrare Servere dupa doua conditii:");
        System.out.print("Introduceti numarul minim de procesoare: ");
        int numarProcesoare = Integer.parseInt(scanner.nextLine());
        System.out.print("Introduceti frecventa minima a procesorului (GHz): ");
        float frecventaMinima = Float.parseFloat(scanner.nextLine());

        System.out.println("\nServere care respecta conditiile:");
        for (Server server : vectorServere) {
            if (server.getNumarProcesoare() >= numarProcesoare && server.getFrecventaProcesor() >= frecventaMinima) {
                System.out.println(server);
            }
        }
    }
}
