package me.dio.autodromo;

public class Carro extends Veiculo{

    @Override
    public void ligar() {
        confereCombustivel();
        confereCambio();
        System.out.println("CARRO LIGADO!!");
    }

    private void confereCombustivel() {
        System.out.println("Conferindo combustivel.");
    }

    private void confereCambio() {
        System.out.println("Conferindo cambio em P");
    }
}
