package com.mycompany.calculator;
public class Server extends Calculator {
    private int numarProcesoare;
    private String tipProcesor;
    private float frecventaProcesor;
    private short memorieRAM;
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
   @Override
public String toString() {
    return "Server [Marca=" + getMarca() + ", Model=" + getModel() + 
           ", Număr Procesoare=" + numarProcesoare + 
           ", Tip Procesor=" + tipProcesor + 
           ", Frecvență Procesor=" + frecventaProcesor + 
           " GHz, Memorie RAM=" + memorieRAM + " GB]";
}

}
