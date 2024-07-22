package example.jogo.personagem.director;

import example.jogo.personagem.Corpo;
import example.jogo.personagem.Habilidades;
import example.jogo.personagem.Personagem;
import example.jogo.personagem.Personalidade;
import example.jogo.personagem.builder.HabilidadesBuilder;
import example.jogo.personagem.builder.PersonagemBuilder;
import example.jogo.personagem.builder.PersonalidadeBuilder;

public class PersonagemDirector {
    public Personagem buildPersonagemCascaGrossa(String nome){
        return new PersonagemBuilder().setNome(nome)
                                      .setCorpo(new Corpo(Corpo.ENDOMORFO, Corpo.ALTO))
                                      .setPersonalidade(new PersonalidadeBuilder().setBravo(true)
                                                                                  .setExplosivo(true)
                                                                                  .setPensativo(true)
                                                                                  .build())
                                      .setHabilidades(new HabilidadesBuilder().setFurtivo(true)
                                                                              .setVeloz(true)
                                                                              .setBonsReflexos(true)
                                                                              .setMontarEstrategia(true)
                                                                              .setEspionar(true)
                                                                              .build())
                                      .build();
    }

}
