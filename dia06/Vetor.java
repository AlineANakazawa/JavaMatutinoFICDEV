package dia06;

import java.util.ArrayList;

public class Vetor {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        for(Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
