package dia07;

public class Gato extends Animal{
    int corPelo;
    
    @Override
    public String toString() {
        return "Gato\nAltura: " + altura + "\nPata: " + pata +
            "\nCor Pelo: " + corPelo + "\n";
    }
    
    public Gato(int p, int a) {
        super(p, a);
    }
    
    public Gato(int p, int a, int corPelo) {
        super(p, a);
        this.corPelo = corPelo;
    }
    
    public void falar() {
        miar();
    }
    
    private void miar() {
        System.out.println("MIAU!");
    }
}
