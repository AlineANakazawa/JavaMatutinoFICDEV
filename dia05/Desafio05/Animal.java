package dia05.Desafio05;

import javax.swing.JOptionPane;

public class Animal {
    public static void main(String[] srgs) {
        Taxonomia t = new Taxonomia();
        t.taxon = "lupus";
        t.setFam("Canis");
        Mostrar(t);
    }
    
    public static void Mostrar(Taxonomia t) {
        JOptionPane.showMessageDialog
            (null, "Taxonomia: " + t.taxon);
        JOptionPane.showMessageDialog
            (null, "Família: " + t.getFam());
    }
}
