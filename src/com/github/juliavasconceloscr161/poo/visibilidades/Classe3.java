package com.github.juliavasconceloscr161.poo.visibilidades;

public class Classe3 {

    Classe1 classe1;
    //Tem acesso ao atributo1 e atributo2, pois mesmo que não seja subclasse de Classe1, está no mesmo pacote

    void metodo(){
        classe1.metodo2();
        classe1.metodo3();
    }

}
