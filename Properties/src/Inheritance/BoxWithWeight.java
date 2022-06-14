package Inheritance;

public class BoxWithWeight extends  Box{
    int weight = -1;

    BoxWithWeight(){
        this.weight = -1;
    }

    public BoxWithWeight(BoxWithWeight boxx){

        super(boxx);   // This thing is totally similar to Box 1 = new BOxWeight();
        // internally it will have access to box type variables only BOx old = 1 wich of BoxWeight type
    }
    BoxWithWeight(int side, int w){

        super(side);  // this is just calling the constructor of the parent class that has only one argument
        this.weight = w;  // ctrl + click  // here after declaring length as private it is not giving erorr
        // and still initialising cause we are calling the constructor of parent class

    }
}
