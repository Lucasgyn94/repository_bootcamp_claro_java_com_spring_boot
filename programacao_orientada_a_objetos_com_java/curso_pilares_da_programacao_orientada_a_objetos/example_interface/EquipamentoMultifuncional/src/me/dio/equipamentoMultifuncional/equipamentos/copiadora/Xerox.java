package me.dio.equipamentoMultifuncional.equipamentos.copiadora;

public class Xerox implements Copiadora{
    @Override
    public void copiar() {
        System.out.println(getClass().getName() + ": COPIANDO");
    }
}
