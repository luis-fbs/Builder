package example.jogo.personagem.builder;

import example.jogo.personagem.Corpo;
import example.jogo.personagem.Habilidades;
import example.jogo.personagem.Personagem;
import example.jogo.personagem.Personalidade;

public class PersonagemBuilder {
    private String nome;
    private Corpo corpo;
    private Personalidade personalidade;
    private Habilidades habilidades;

    public PersonagemBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public PersonagemBuilder setCorpo(Corpo corpo) {
        this.corpo = corpo;
        return this;
    }

    public PersonagemBuilder setPersonalidade(Personalidade personalidade) {
        this.personalidade = personalidade;
        return this;
    }

    public PersonagemBuilder setHabilidades(Habilidades habilidades) {
        this.habilidades = habilidades;
        return this;
    }

    public Personagem build(){
        return new Personagem(nome, corpo, personalidade, habilidades);
    }
}