package com.github.juliavasconceloscr161.poo.visibilidades.outropacote;

import com.github.juliavasconceloscr161.poo.visibilidades.Classe1;

public class Classe4 {
    Classe1 classe1;

    void metodo(){
        classe1.metodo3();
        //somente atributos e métodos públicos estão acessíveis, pois a classe não está no mesmo pacote e não é subclasse de Classe1
    }
}
