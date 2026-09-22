public class Zoo {
    public static void main(String[] args) {
        Zoo a = new Zoo();
    }

    public Zoo(){
Zebra a = new Zebra();
a.makeSound();
Bunny b = new Bunny();
b.eat();
Gorilla g = new Gorilla();
System.out.println(g.getBananasConsumed() + " bananas!");

    g.setBananasConsumed(4090);
        System.out.println(g.getBananasConsumed() + " bananas!");
    g.setWeight(300);
        System.out.println("The weight of the gorrila is: " + g.getWeight());

    }



    public void method1(){
        System.out.println("hi in method 1");
    }



}
