package cap02;

public class MinhaClasse {
    private int valor1;
    private int valor2;
    
    public MinhaClasse(int v1, int v2) {
        this.valor1 = v1;
        this.valor2 = v2;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }
    
    public int somar() {
        return this.valor1 + this.valor2;
    }
    
    public int subtrair() {
        return this.valor1 - this.valor2;
    }
}
