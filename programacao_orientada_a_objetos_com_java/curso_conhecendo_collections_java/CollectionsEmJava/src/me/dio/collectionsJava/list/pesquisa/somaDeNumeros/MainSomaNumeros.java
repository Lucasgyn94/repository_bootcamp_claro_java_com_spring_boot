package me.dio.collectionsJava.list.pesquisa.somaDeNumeros;

public class MainSomaNumeros {
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);

        System.out.println("Exibindo todos os numeros: ");
        System.out.println(somaNumeros.exibirNumeros());

        System.out.println("\nExibindo soma de todos os numeros: ");
        System.out.println(somaNumeros.calcularSoma());

        System.out.println("\nMaior numero: ");
        System.out.println(somaNumeros.encontrarMaiorNumero());

        System.out.println("\nMenor numero: ");
        System.out.println(somaNumeros.encontrarMenorNumero());
    }
}
