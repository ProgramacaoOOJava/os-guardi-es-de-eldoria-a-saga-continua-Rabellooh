public abstract class Personagem {
    private String nome;
    private String classe;
    private int nivel;
    private int pontosDeVida;
    private double poderBase;

    public Personagem(
            String nome,
            String classe,
            int nivel,
            int pontosDeVida,
            double poderBase
    ) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    // Cada tipo de personagem implementará sua própria habilidade.
    public abstract void usarHabilidade();

    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos de Vida: " + pontosDeVida);
        System.out.println("Poder Base: " + poderBase);
    }

    public String getNome() {
        return nome;
    }
}