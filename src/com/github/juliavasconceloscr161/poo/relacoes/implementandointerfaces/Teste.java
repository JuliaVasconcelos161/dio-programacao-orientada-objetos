package com.github.juliavasconceloscr161.poo.relacoes.implementandointerfaces;

public class Teste {
    public static void main(String[] args) {
        OperacoesMatematicas calculadora = new Calculadora();
        Calculadora calculadora1 = new Calculadora();

        if(calculadora1 instanceof OperacoesMatematicas){
            System.out.println("calculadora1 implementa a interface Operações Matemáticas");
        }
    }
}
