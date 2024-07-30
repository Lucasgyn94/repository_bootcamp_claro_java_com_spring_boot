package me.dio.equipamentoMultifuncional.equipamentos.impressora;

public class DeskJet implements Impressora{
    @Override
    public void imprimir() {
        System.out.println(getClass().getName() + ": IMPRIMINDO");
    }
}
