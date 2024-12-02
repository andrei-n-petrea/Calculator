package com.mycompany.calculator;
public class Desktop extends Calculator {
    private byte ram;
    private short stocare;
    private String formatCarcasa;
    private String placaDeBaza;
    private boolean placaVideoDedicate;
    public Desktop() {
        super();
    }
    public Desktop(String marca, String model, byte ram, short stocare, String formatCarcasa, String placaDeBaza, boolean placaVideoDedicate) {
        super(marca, model);
        this.ram = ram;
        this.stocare = stocare;
        this.formatCarcasa = formatCarcasa;
        this.placaDeBaza = placaDeBaza;
        this.placaVideoDedicate = placaVideoDedicate;
    }
    public Desktop(Desktop altDesktop) {
        super(altDesktop.getMarca(), altDesktop.getModel());
        this.ram = altDesktop.ram;
        this.stocare = altDesktop.stocare;
        this.formatCarcasa = altDesktop.formatCarcasa;
        this.placaDeBaza = altDesktop.placaDeBaza;
        this.placaVideoDedicate = altDesktop.placaVideoDedicate;
    }
    @Override
    public void pornire() {
        System.out.println("Desktop-ul " + getModel() + " se pornește.");
    }
    @Override
    public void oprire() {
        System.out.println("Desktop-ul " + getModel() + " se oprește.");
    }
    public byte getRam() {
        return ram;
    }
    public void setRam(byte ram) {
        this.ram = ram;
    }
    public short getStocare() {
        return stocare;
    }
    public void setStocare(short stocare) {
        this.stocare = stocare;
    }
    public String getFormatCarcasa() {
        return formatCarcasa;
    }
    public void setFormatCarcasa(String formatCarcasa) {
        this.formatCarcasa = formatCarcasa;
    }
    public String getPlacaDeBaza() {
        return placaDeBaza;
    }
    public void setPlacaDeBaza(String placaDeBaza) {
        this.placaDeBaza = placaDeBaza;
    }
    public boolean isPlacaVideoDedicate() {
        return placaVideoDedicate;
    }
    public void setPlacaVideoDedicate(boolean placaVideoDedicate) {
        this.placaVideoDedicate = placaVideoDedicate;
    }
    @Override
    public String toString() {
        return "Desktop [marca=" + getMarca() + ", model=" + getModel() + ", RAM=" + ram + "GB, stocare=" + stocare + "GB, " +
               "formatCarcasa=" + formatCarcasa + ", placaDeBaza=" + placaDeBaza + ", placaVideoDedicate=" + placaVideoDedicate + "]";
    }
}
