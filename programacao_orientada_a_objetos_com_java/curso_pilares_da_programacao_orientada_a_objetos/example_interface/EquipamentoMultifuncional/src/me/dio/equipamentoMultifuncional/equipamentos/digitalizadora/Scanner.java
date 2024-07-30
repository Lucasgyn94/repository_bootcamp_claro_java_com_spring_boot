package me.dio.equipamentoMultifuncional.equipamentos.digitalizadora;

public class Scanner implements Digitalizadora{

    @Override
    public void digitalizar() {
        System.out.println(getClass().getName() + ": DIGITALIZANDO");
    }
}
