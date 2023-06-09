package dia07;

public class Cachorro extends Animal{
    int corPelo;

    @Override
    public String toString() {
        return "Cachorro\nAltura: " + altura + "\nPata: " + pata +
            "\nCor Pelo: " + corPelo + "\n";
    }
    
    public Cachorro(int p, int a) {
        super(p, a);
    }
    
    public Cachorro(int p, int a, int corPelo){
        super(p,a);
        this.corPelo = corPelo;
    }
    
    public void falar() {
        latir();
    }
    
    private void latir() {
        System.out.println("AUAU!");
    }
}