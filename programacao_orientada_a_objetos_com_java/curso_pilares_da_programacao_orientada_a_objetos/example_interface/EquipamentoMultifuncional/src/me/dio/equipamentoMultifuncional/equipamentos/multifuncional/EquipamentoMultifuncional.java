package me.dio.equipamentoMultifuncional.equipamentos.multifuncional;

import me.dio.equipamentoMultifuncional.equipamentos.copiadora.Copiadora;
import me.dio.equipamentoMultifuncional.equipamentos.digitalizadora.Digitalizadora;
import me.dio.equipamentoMultifuncional.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    @Override
    public void copiar() {
        System.out.println("COPIANDO VIA: " + getClass().getName());
    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA: " + getClass().getName());
    }

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO VIA: " + getClass().getName());
    }
}
