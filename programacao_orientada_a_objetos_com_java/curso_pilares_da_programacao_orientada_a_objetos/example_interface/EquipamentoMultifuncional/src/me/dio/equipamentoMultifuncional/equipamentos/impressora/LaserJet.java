package me.dio.equipamentoMultifuncional.equipamentos.impressora;

public class LaserJet implements Impressora{
    @Override
    public void imprimir() {
        System.out.println(getClass().getName().charAt() + ": IMPRIMINDO");
    }
}
