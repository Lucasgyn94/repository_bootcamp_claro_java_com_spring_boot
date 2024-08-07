package me.dio.collectionsJava.map.operacoesBasicas.agendaDeContatos;

public class Main {

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Lucas", 123456);
        agendaContatos.adicionarContato("Lucas", 5665);
        agendaContatos.adicionarContato("Lucas Ferreira", 111111);
        agendaContatos.adicionarContato("Lucas Dio", 654987);
        agendaContatos.adicionarContato("Tampinha Silva", 111111);
        agendaContatos.adicionarContato("Jiosepe", 444444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Jiosepe");
        agendaContatos.exibirContatos();

        System.out.println("O numero e: " + agendaContatos.pesquisaTelefonePorNome("Tampinha Silva"));

    }
}
