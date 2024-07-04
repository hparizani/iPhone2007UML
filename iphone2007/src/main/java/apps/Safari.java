package apps;

public class Safari implements NavegadorInternet{
    public void exibirPagina(String url) {
        System.out.println("Exibindo o site: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA PÁGINA");
    }

    public void atualizarPagina() {
        System.out.println("ATUALIZANDO A PÁGINA");
    }
}
