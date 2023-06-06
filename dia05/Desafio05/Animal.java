package dia05.Desafio05;

import javax.swing.JOptionPane;

public class Animal {
    public static void main(String[] srgs) {
        Taxonomia t = new Taxonomia();
        String fam = JOptionPane.showInputDialog
                (null,"Digite a familia do animal: ");
        String taxon = JOptionPane.showInputDialog
                (null, "Digite a taxonomia do animal: ");
        
        t.taxon = taxon;
        t.setFam(fam);
        Mostrar(t);
    }
    
    public static void Mostrar(Taxonomia t) {
        JOptionPane.showMessageDialog
            (null, t.getFam() + " " + t.taxon);
    }
}
