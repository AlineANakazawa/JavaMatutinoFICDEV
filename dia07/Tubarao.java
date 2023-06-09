package dia07;

public class Tubarao implements Animal_Interface, Peixe_Interface{
    public void respirar() {
        System.out.println("Usando guelras!");
    }
    public void nadar() {
        System.out.println("Mergulhando!");
    }
}
