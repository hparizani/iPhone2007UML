package apps;

public class Mail implements Email{
    public void enviarEmail() {
        System.out.println("ENVIANDO EMAIL");
    }

    public void abrirEmail(String email) {
        System.out.println("ABRINDO O EMAIL " + email);
    }

    public void apagarEmail(String email) {
        System.out.println("APAGANDO O EMAIL " + email);
    }
}
