package dia05;

public class CarroEsportivo extends Carro {
    public void acelerar() {
        this.ano = 2023;
        this.modelo = "Esportivo";
        //this.fabricante = "Ferrari";
        //erro de compilação, fabricante é privado
    }
}
