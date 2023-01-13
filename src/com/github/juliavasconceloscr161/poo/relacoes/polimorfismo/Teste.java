package com.github.juliavasconceloscr161.poo.relacoes.polimorfismo;

public class Teste {
    public static void main(String[] args) {
        ClasseMae[] classes = {new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        for(ClasseMae classe: classes){
            classe.Metodo1();
        }

        System.out.println();

        for(ClasseMae classe: classes){
            classe.Metodo2();
        }

        System.out.println();
        //sobrescrita
        ClasseFilha2 f2 = new ClasseFilha2();
        f2.Metodo2();
    }
}
