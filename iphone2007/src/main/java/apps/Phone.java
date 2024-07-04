package apps;

public class Phone implements AparelhoTelefonico{
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("ATEDENDO CHAMADA");
    }

    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    public void adicionarFavorito(String contato) {
        System.out.println("ADICIANDO CONTATO " + contato + " AOS FAVORITOS");
    }
}
