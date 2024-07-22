package example.jogo.personagem;

public class Personalidade {
    private Boolean alegre,
                    bravo,
                    calmo,
                    explosivo,
                    melancolico,
                    pensativo;

    public Personalidade(Boolean alegre, Boolean bravo, Boolean calmo, Boolean explosivo, Boolean melancolico, Boolean pensativo) {
        this.alegre = alegre;
        this.bravo = bravo;
        this.calmo = calmo;
        this.explosivo = explosivo;
        this.melancolico = melancolico;
        this.pensativo = pensativo;
    }
}
