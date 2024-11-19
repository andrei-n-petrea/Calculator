/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;
/**
 *
 * @author HP
 */

public class Server extends Calculator {
    private int stocare;  
    private String procesor;
    private byte memorieRAM; 
    private String tipRetea;

    public Server() {
        super();
    }

    public Server(String marca, String model, int stocare, String procesor, byte memorieRAM, String tipRetea) {
        super(marca, model);
        this.stocare = stocare;
        this.procesor = procesor;
        this.memorieRAM = memorieRAM;
        this.tipRetea = tipRetea;
    }

    public Server(Server altServer) {
        super(altServer);
        this.stocare = altServer.stocare;
        this.procesor = altServer.procesor;
        this.memorieRAM = altServer.memorieRAM;
        this.tipRetea = altServer.tipRetea;
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
        return super.toString() + " [stocare=" + stocare + " GB, procesor=" + procesor +
                ", memorieRAM=" + memorieRAM + " GB, tipRetea=" + tipRetea + "]";
    }

    public int getStocare() {
        return stocare;
    }

    public void setStocare(int stocare) {
        this.stocare = stocare;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public byte getMemorieRAM() {
        return memorieRAM;
    }

    public void setMemorieRAM(byte memorieRAM) {
        this.memorieRAM = memorieRAM;
    }

    public String getTipRetea() {
        return tipRetea;
    }

    public void setTipRetea(String tipRetea) {
        this.tipRetea = tipRetea;
    }
}
