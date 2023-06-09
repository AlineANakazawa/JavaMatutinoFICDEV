package dia07;

public class Animal {
    protected int altura;
    protected int pata;
    
    @Override
    public String toString() {
        return "Animal\nAltura: " + altura + "\nPata: " + pata + "\n";
    }
    
    public Animal(int pata, int altura) {
        this.pata = pata;
        this.altura = altura;
    }
    
    public void falar() {
        System.out.println("som");
    }
    
    public void respirar() {
        System.out.println("Respira");
    }
}
