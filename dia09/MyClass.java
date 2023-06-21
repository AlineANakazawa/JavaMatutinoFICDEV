package dia09;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyClass {
    private static Logger logger;
    
    public static void main(String[] args) {
        logger = Logger.getLogger(Dia09.class.getName());
        logger.log(Level.INFO, "Mensagem informativa");
        logger.log(Level.WARNING, "Mensagem de aviso");
    }
}
