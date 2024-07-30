package me.dio.equipamentoMultifuncional.estabelecimento;

import me.dio.equipamentoMultifuncional.equipamentos.impressora.DeskJet;
import me.dio.equipamentoMultifuncional.equipamentos.impressora.Impressora;
import me.dio.equipamentoMultifuncional.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Impressora deskJet = new DeskJet();
        deskJet.imprimir();

        Impressora laserJet = new DeskJet();
        laserJet.imprimir();

        Impressora eqMulti = new EquipamentoMultifuncional();
        eqMulti.imprimir();

    }
}
