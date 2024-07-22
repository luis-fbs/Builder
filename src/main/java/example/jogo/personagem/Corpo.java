package example.jogo.personagem;

public class Corpo {
    public static int ECTOMORFO = 0;
    public static int MESOMORFO = 1;
    public static int ENDOMORFO = 2;
    public static int ALTO = 0;
    public static int MEDIO = 1;
    public static int BAIXO = 2;

    private int tipo;
    private int estatura;

    public Corpo(int tipo, int estatura) {
        this.tipo = tipo;
        this.estatura = estatura;
    }
}
