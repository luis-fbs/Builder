package example.jogo.personagem.builder;

import example.jogo.personagem.Personalidade;

public class PersonalidadeBuilder {
    private Boolean alegre,
                    bravo,
                    calmo,
                    explosivo,
                    melancolico,
                    pensativo;

    public PersonalidadeBuilder setAlegre(Boolean alegre) {
        this.alegre = alegre;
        return this;
    }

    public PersonalidadeBuilder setBravo(Boolean bravo) {
        this.bravo = bravo;
        return this;
    }

    public PersonalidadeBuilder setCalmo(Boolean calmo) {
        this.calmo = calmo;
        return this;
    }

    public PersonalidadeBuilder setExplosivo(Boolean explosivo) {
        this.explosivo = explosivo;
        return this;
    }

    public PersonalidadeBuilder setMelancolico(Boolean melancolico) {
        this.melancolico = melancolico;
        return this;
    }

    public PersonalidadeBuilder setPensativo(Boolean pensativo) {
        this.pensativo = pensativo;
        return this;
    }

    public Personalidade build(){
        return new Personalidade(alegre, bravo, calmo, explosivo, melancolico, pensativo);
    }
}