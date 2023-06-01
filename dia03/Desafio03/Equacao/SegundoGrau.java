package dia03.Desafio03.Equacao;

public class SegundoGrau {
    private int a;
    private int b;
    private int c;
    
    public SegundoGrau(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int CalculaY(int x) {
        return this.a * x * x + this.b * x + this.c;
    }
}
