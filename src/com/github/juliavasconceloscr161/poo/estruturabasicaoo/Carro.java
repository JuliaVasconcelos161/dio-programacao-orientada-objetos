package com.github.juliavasconceloscr161.poo.estruturabasicaoo;

public class Carro {
    private double capacidadeTanque = 100.2;
    private String cor = "Azul";
    private String modelo;

    public Carro(){}

    public Carro(double capacidadeTanque, String cor, String modelo){
        this.capacidadeTanque = capacidadeTanque;
        this.cor = cor;
        this.modelo = modelo;
    }
    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double valorTanqueCheio(double valorGasolina) {
        return valorGasolina * this.capacidadeTanque;
    }
}
