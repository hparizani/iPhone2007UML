import apps.*;

public class iPhone {
    public static void main(String[] args) {

        ReprodutorMultimidia ipod = new Ipod();

        String musica = "Come as you are";
        String album = "Nevermind";
        String filme = "Piratas do Caribe";

        ipod.tocar();
        ipod.pausar();
        ipod.selecionarMusica(musica);
        ipod.selecionarAlbum(album);
        ipod.selecionarFilme(filme);

        Email mail = new Mail();

        String email = "Promação do dia 20/06";
        mail.enviarEmail();
        mail.abrirEmail(email);
        mail.apagarEmail(email);

        AparelhoTelefonico phone = new Phone();

        String numero = "(11)98876-1501";
        String contato = "Jorge";
        phone.ligar(numero);
        phone.atender();
        phone.adicionarFavorito(contato);
        phone.iniciarCorreioVoz();

        NavegadorInternet safari = new Safari();

        String url = "https://www.apple.com/br/newsroom/2007/01/09Apple-Reinvents-the-Phone-with-iPhone/";
        safari.exibirPagina(url);
        safari.adicionarNovaAba();
        safari.atualizarPagina();
    }
}
