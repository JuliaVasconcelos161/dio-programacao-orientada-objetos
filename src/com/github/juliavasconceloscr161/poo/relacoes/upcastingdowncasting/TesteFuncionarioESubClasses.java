package com.github.juliavasconceloscr161.poo.relacoes.upcastingdowncasting;

public class TesteFuncionarioESubClasses {
    public static void main(String[] args) {
        //Upcasting
        Funcionario vendedor = new Vendedor();
        Funcionario gerenteFuncionario = new Gerente();
        Funcionario faxineiroFuncionario = new Faxineiro();

        //Downcasting
        Gerente gerente = (Gerente) new Funcionario();
    }
}
