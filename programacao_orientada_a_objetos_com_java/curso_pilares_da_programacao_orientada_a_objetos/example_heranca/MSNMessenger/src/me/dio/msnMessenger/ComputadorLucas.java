package me.dio.msnMessenger;

public class ComputadorLucas {
    public static void main(String[] args) {
        //abrindo MSN Messenger
        System.out.println("MSN: ");
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("Facebook: ");
        FacebookMessenger fcb = new FacebookMessenger();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        System.out.println("Telegram: ");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();

    }
}
