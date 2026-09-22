public abstract class Animal {
    private int numLegs =2;
    public abstract void makeSound();
    public abstract void eat();

    public void move(){

    }
    // getter
    public int getNumLegs(){
        return numLegs;
    }
    // setter
    public void setNumLegs(int numLegs){
        this.numLegs = numLegs;
    }
}
// testing github