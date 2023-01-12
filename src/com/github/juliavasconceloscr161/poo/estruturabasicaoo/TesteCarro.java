package com.github.juliavasconceloscr161.poo.estruturabasicaoo;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setCapacidadeTanque(100);
        carro1.setCor("Azul");
        carro1.setModelo("Fusca");

        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Cor: " + carro1.getCor());
        System.out.println("Capacidade do tanque: " + carro1.getCapacidadeTanque());
        System.out.println("Preço para encher o tanque: " + carro1.valorTanqueCheio(6.5));

        Carro carro2 = new Carro(50, "Prata", "Corsa");

        System.out.println("\nModelo: " + carro2.getModelo());
        System.out.println("Cor: " + carro2.getCor());
        System.out.println("Capacidade do tanque: " + carro2.getCapacidadeTanque());
        System.out.println("Preço para encher o tanque: " + carro2.valorTanqueCheio(6.5));
    }


}
