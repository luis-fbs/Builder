package example.jogo.personagem.builder;

import example.jogo.personagem.Habilidades;

public class HabilidadesBuilder {
    private Boolean furtivo,
                    veloz,
                    bonsReflexos,
                    montarEstrategia,
                    espionar;

    public HabilidadesBuilder setFurtivo(Boolean furtivo) {
        this.furtivo = furtivo;
        return this;
    }

    public HabilidadesBuilder setVeloz(Boolean veloz) {
        this.veloz = veloz;
        return this;
    }

    public HabilidadesBuilder setBonsReflexos(Boolean bonsReflexos) {
        this.bonsReflexos = bonsReflexos;
        return this;
    }

    public HabilidadesBuilder setMontarEstrategia(Boolean montarEstrategia) {
        this.montarEstrategia = montarEstrategia;
        return this;
    }

    public HabilidadesBuilder setEspionar(Boolean espionar) {
        this.espionar = espionar;
        return this;
    }

    public Habilidades build(){
        return new Habilidades(furtivo, veloz, bonsReflexos, montarEstrategia, espionar);
    }
}
