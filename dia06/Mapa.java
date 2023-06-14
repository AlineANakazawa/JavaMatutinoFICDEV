package dia06;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Mapa {
    public static void main(String[] args) {
        Map<String, Integer> meuMapa = new HashMap<String,Integer>();
        meuMapa.put("Alice", 25);
        meuMapa.put("Bob", 30);
        meuMapa.put("Carol", 28);
        Integer idadeBob = meuMapa .get("Bob");
        JOptionPane.showMessageDialog
            (null, idadeBob);
    }
}
