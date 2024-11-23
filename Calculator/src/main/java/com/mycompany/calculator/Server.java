/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Server extends Calculator {
    private int numarProcesoare;
    private String tipProcesor;
    private float frecventaProcesor;
    private short memorieRAM;
    private ArrayList<Server> instantaVector = new ArrayList<>();
    public Server() {
        super();
    }

    
    public Server(String marca, String model, int numarProcesoare, String tipProcesor, float frecventaProcesor, short memorieRAM) {
        super(marca, model);
        this.numarProcesoare = numarProcesoare;
        this.tipProcesor = tipProcesor;
        this.frecventaProcesor = frecventaProcesor;
        this.memorieRAM = memorieRAM;
    }

    
    public Server(Server altServer) {
        super(altServer.getMarca(), altServer.getModel());
        this.numarProcesoare = altServer.numarProcesoare;
        this.tipProcesor = altServer.tipProcesor;
        this.frecventaProcesor = altServer.frecventaProcesor;
        this.memorieRAM = altServer.memorieRAM;
    }

  
    @Override
    public void pornire() {
        System.out.println("Server-ul " + getModel() + " se pornește.");
    }

   
    @Override
    public void oprire() {
        System.out.println("Server-ul " + getModel() + " se oprește.");
    }

    
    public int getNumarProcesoare() {
        return numarProcesoare;
    }

    public void setNumarProcesoare(int numarProcesoare) {
        this.numarProcesoare = numarProcesoare;
    }

    public String getTipProcesor() {
        return tipProcesor;
    }

    public void setTipProcesor(String tipProcesor) {
        this.tipProcesor = tipProcesor;
    }

    public float getFrecventaProcesor() {
        return frecventaProcesor;
    }

    public void setFrecventaProcesor(float frecventaProcesor) {
        this.frecventaProcesor = frecventaProcesor;
    }

    public short getMemorieRAM() {
        return memorieRAM;
    }

    public void setMemorieRAM(short memorieRAM) {
        this.memorieRAM = memorieRAM;
    }

    public ArrayList<Server> getVectorServer() {
        return instantaVector;
    }

    public void creareVector() {
        for (int i = 0; i < 10; i++) {
            instantaVector.add(new Server(
                    "Marca" + (i + 1),
                    "Model" + (i + 1),
                    i + 1,
                    "Procesor" + i,
                    2.5f + i,
                    (short) (16 + i * 4)
            ));
        }
    }

   
    public void afisareVector() {
        for (Server server : instantaVector) {
            System.out.println(server);
        }
    }

   
    public void afisareVectorConditieMarcaCeruta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti marca dorita: ");
        String marcaCautata = scanner.nextLine();

        for (Server server : instantaVector) {
            if (marcaCautata.equals(server.getMarca())) {
                System.out.println(server);
            }
        }
    }

   
    public void afisareVectorConditieModelCerut() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti modelul dorit: ");
        String modelCautat = scanner.nextLine();

        for (Server server : instantaVector) {
            if (server.getModel().contains(modelCautat)) {
                System.out.println(server);
            }
        }
    }

  
    @Override
    public String toString() {
        return super.toString() +
                ", Server [numarProcesoare=" + numarProcesoare +
                ", tipProcesor=" + tipProcesor +
                ", frecventaProcesor=" + frecventaProcesor +
                ", memorieRAM=" + memorieRAM + "]";
    }
}
