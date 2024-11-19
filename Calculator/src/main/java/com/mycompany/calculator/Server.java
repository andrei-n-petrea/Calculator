/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;
/**
 *
 * @author HP
 */
import java.util.ArrayList;  

public class Server extends Calculator {
    private long stocare;
    private String procesor;
    private float frecventaProcesor;
    private short memorieRAM;
    private ArrayList<Object> instantaVector = new ArrayList<>();

    public Server() {
        super();
    }

    public Server(String marca, String model, long stocare, String procesor, float frecventaProcesor, short memorieRAM) {
        super(marca, model);
        this.stocare = stocare;
        this.procesor = procesor;
        this.frecventaProcesor = frecventaProcesor;
        this.memorieRAM = memorieRAM;
    }

    public Server(Server altServer) {
        super(altServer);
        this.stocare = altServer.stocare;
        this.procesor = altServer.procesor;
        this.frecventaProcesor = altServer.frecventaProcesor;
        this.memorieRAM = altServer.memorieRAM;
    }

    @Override
    public void pornire() {
        System.out.println("Serverul se pornește.");
    }

    @Override
    public void oprire() {
        System.out.println("Serverul se oprește.");
    }

    @Override
    public String toString() {
        return super.toString() + " [stocare=" + stocare + " TB, procesor=" + procesor +
                ", frecventaProcesor=" + frecventaProcesor + " GHz, memorieRAM=" + memorieRAM + " GB]";
    }

   
    public ArrayList<Object> getInstantaVector() {
        return instantaVector;
    }

    public void setInstantaVector(ArrayList<Object> instantaVector) {
        this.instantaVector = instantaVector;
    }


    public long getStocare() {
        return stocare;
    }

    public void setStocare(long stocare) {
        this.stocare = stocare;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
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
}
