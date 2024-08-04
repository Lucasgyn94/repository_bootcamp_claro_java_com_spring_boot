package me.dio.collectionsJava.set.pesquisa.agendaDeContatos;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        System.out.println("AGENDA DE CONTATOS ANTES DA ADIÇAO: ");
        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Lucas", 123456);
        agendaContatos.adicionarContato("Lucas", 0);
        agendaContatos.adicionarContato("Lucas Ferreira", 11111111);
        agendaContatos.adicionarContato("Lucas Dio", 62945896);
        agendaContatos.adicionarContato("Tampinha Silva", 11111111);

        System.out.println("AGENDA DE CONTATOS APOS DA ADIÇAO: ");
        agendaContatos.exibirContatos();

        System.out.println("PESQUISANDO POR NOME: ");
        System.out.println(agendaContatos.pesquisarPorNome("lucas"));


        System.out.println("ATUALIZANDO CONTATO: ");
        agendaContatos.atualizarNumeroContato("tampinha silva", 99999999);
        agendaContatos.exibirContatos();


    }
}
