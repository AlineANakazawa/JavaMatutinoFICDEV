package dia07;

public class Main2 {
    public static void main(String[] args) {
        Animal meusAnimais [] = new Animal[10];
        meusAnimais[0] = new Animal(4,30);
        meusAnimais[1] = new Cachorro(4,15, 2);
        meusAnimais[2] = new Cachorro(4,15);
        meusAnimais[3] = new Gato(4,10);
        
        for(Animal animal : meusAnimais) {
            System.out.print("\n" + animal.toString());
            animal.falar();
        }
    }
}
