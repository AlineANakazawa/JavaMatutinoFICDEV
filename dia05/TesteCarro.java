package dia05;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Sedan";
        carro.ano = 2021;
        //TesteCArro e CArro estão no mesmo pacote
        
        CarroEsportivo esportivo = new CarroEsportivo();
        esportivo.modelo = "Esportivo";
        esportivo.ano = 2023;
    }
}
