package example.jogo.personagem;

public class Personagem {
    private String nome;
    private Corpo corpo;
    private Personalidade personalidade;
    private Habilidades habilidades;

    public Personagem(String nome, Corpo corpo, Personalidade personalidade, Habilidades habilidades) {
        this.nome = nome;
        this.corpo = corpo;
        this.personalidade = personalidade;
        this.habilidades = habilidades;
    }
}
