public class Gorilla {
    private int bananasConsumed;
    private int weight;
    // 3 visibilities: public, private, and protected

    public Gorilla (){
        bananasConsumed = 2060;
        weight = 213;

    }

    // getter
    public int getWeight(){
        return weight;
    }

    // setter
    public void setWeight (int weight){
        this.weight = weight;
    }

    // getter
    public int getBananasConsumed (){
        return bananasConsumed;
    }

    // setter
    public void setBananasConsumed (int bananasConsumed){
        this.bananasConsumed = bananasConsumed;
    }

    // to do: to make the getter and setter for weight
    // to do: use the getters and setters in the zoo
}
