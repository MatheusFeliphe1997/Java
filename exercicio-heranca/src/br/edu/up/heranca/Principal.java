package br.edu.up.heranca;

import br.edu.up.heranca.modelo.Equipamento;
import br.edu.up.heranca.modelo.EquipamentoSonoro;

public class Principal {
    public static void main(String[] args) {

        var eq = new EquipamentoSonoro();
        eq.ligar();
        eq.estereo();
        System.out.println(eq.getLigado());
        System.out.println(eq.getEstereo());
        System.out.println(eq.getVolume());
    }
}
