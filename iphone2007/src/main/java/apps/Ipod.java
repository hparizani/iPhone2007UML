package apps;

public class Ipod implements ReprodutorMultimidia {
    public void tocar() {
        System.out.println("TOCANDO MÚSICA");
    }

    public void pausar() {
        System.out.println("PAUSANDO MÚSICA");
    }

    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO A MÚSICA " + musica);
    }

    public void selecionarAlbum(String album) {
        System.out.println("SELECIONANDO O ALBUM " + album);
    }

    public void selecionarFilme(String filme) {
        System.out.println("SELECIONANDO O FILME " + filme);
    }
}
