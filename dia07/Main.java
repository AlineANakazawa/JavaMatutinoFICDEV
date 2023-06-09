package dia07;

public class Main {
    public static void main(String[] args) {
        Animal meuAnimal = new Animal(4,10);
        Cachorro meuCachorro = new Cachorro(4,20,2);
        Animal meuAnimal2 = new Cachorro(4,30,3);
        
        System.out.println(meuAnimal.toString());
        System.out.println(meuCachorro.toString());
        System.out.println(meuAnimal2.toString());
    }
}
