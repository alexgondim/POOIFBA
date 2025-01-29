public class Main {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        Animal meuAnimal = new Cachorro() ;
        Animal meuAnimal2 = new Gato() ;

        meuAnimal.fazerSom();
        meuAnimal2.fazerSom();
        Animal meuAnimal3 = new Animal() ;
        meuAnimal3.fazerSom();

    }
}