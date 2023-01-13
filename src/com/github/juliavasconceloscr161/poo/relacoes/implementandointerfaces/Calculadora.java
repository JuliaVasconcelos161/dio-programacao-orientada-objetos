package com.github.juliavasconceloscr161.poo.relacoes.implementandointerfaces;

public class Calculadora implements OperacoesMatematicas{
    @Override
    public int somar(int numero1, int numero2) {
        return numero1+numero2;
    }

    @Override
    public int subtrair(int numero1, int numero2) {
        return numero1-numero2;
    }

    @Override
    public int multiplicar(int numero1, int numero2) {
        return numero1-numero2;
    }

    @Override
    public int dividir(int numero1, int numero2) {
        return 0;
    }
}


