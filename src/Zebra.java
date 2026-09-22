public class Zebra extends Animal{

    public Zebra(){
        numLegs = 4;
    }

    @Override
    public void makeSound() {
        System.out.println("i neigh");
    }
    public void eat (){
        System.out.println("The zebra ate grass");
    }
}
