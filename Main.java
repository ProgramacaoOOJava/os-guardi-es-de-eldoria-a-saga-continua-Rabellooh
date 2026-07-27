import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // A lista do tipo Personagem armazena objetos de subclasses diferentes.
        ArrayList<Personagem> personagens = new ArrayList<>();

        personagens.add(new Mago("Luna", 8, 80, 70.0));
        personagens.add(new Mago("Elenara", 10, 90, 60.0));
        personagens.add(new Guerreiro("Rabellour", 10, 100, 50.0));
        personagens.add(new Guerreiro("Darius", 7, 120, 45.0));

        // Cada objeto executa sua própria implementação de usarHabilidade().
        for (Personagem personagem : personagens) {
            personagem.exibirStatus();
            personagem.usarHabilidade();
            System.out.println();
        }
    }
}