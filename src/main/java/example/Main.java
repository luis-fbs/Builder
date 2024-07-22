package example;

import example.jogo.personagem.Corpo;
import example.jogo.personagem.Habilidades;
import example.jogo.personagem.Personagem;
import example.jogo.personagem.Personalidade;
import example.jogo.personagem.builder.HabilidadesBuilder;
import example.jogo.personagem.builder.PersonagemBuilder;
import example.jogo.personagem.builder.PersonalidadeBuilder;
import example.jogo.personagem.director.PersonagemDirector;

public class Main {
    public static void main(String[] args) {
        Personagem personagem =
                new Personagem("Johan", new Corpo(Corpo.ECTOMORFO, Corpo.ALTO),
                        new Personalidade(null, true, null, true, null, true),
                        new Habilidades(null, true, true, null, null));

        Personagem personagem1 =
                new PersonagemBuilder().setNome("Johan")
                                       .setCorpo(new Corpo(Corpo.ECTOMORFO, Corpo.ALTO))
                                       .setHabilidades(new HabilidadesBuilder().setVeloz(true).setBonsReflexos(true).build())
                                       .setPersonalidade(new PersonalidadeBuilder().setPensativo(true).setExplosivo(true).setBravo(true).build())
                                       .build();

        Personagem personagem2 = new Personagem("Johan", new Corpo(Corpo.ECTOMORFO, Corpo.ALTO), null,null);

        Personagem personagem3 = new PersonagemBuilder().setNome("Johan")
                                                        .setCorpo(new Corpo(Corpo.ECTOMORFO, Corpo.ALTO))
                                                        .build();

        Personagem personagem4 =
                new Personagem("Johan", new Corpo(Corpo.ENDOMORFO, Corpo.ALTO),
                        new Personalidade(null, true, null, true, null, true),
                        new Habilidades(true, true, true, true, true));

        Personagem personagem5 = new PersonagemDirector().buildPersonagemCascaGrossa("Johan");
    }
}