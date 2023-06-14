package dia06;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

public class Fila {
    public static void main(String[] args) {
        Queue<Carro> minhaFila = new LinkedList<Carro>();
        minhaFila.add(new Carro("Ford", "Mustang", 2020));
        minhaFila.add(new Carro("Chevrolet", "Camaro", 2021));
        minhaFila.add(new Carro("Dodge", "Charger", 2019));
        Carro carroRemovido = minhaFila.remove();
        JOptionPane.showMessageDialog
            (null, minhaFila);
    }
}
