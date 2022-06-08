package Inheritance;

public class BoxWithWeight extends  Box{
    int weight;

    BoxWithWeight(int side, int w){
        super(side);  // this is just calling the constructor of the parent class that has only one argument
        this.weight = w;  // ctrl + click
    }
}
