package dia06;

public class Carro {
    public String modelo;
    protected int ano;
    private String fabricante;
    
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public String getFabricante() {
        return this.fabricante;
    }
    
    public Carro(String fabricante, String modelo, int ano) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
    }
}