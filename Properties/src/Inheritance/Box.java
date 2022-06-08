package Inheritance;

public class Box {

    int l;
    int b;
    int w;

  public Box(){

        this.l = -1;
        this.b =  -1;
        this.w = -1;

    }

    Box(int side){
        this.l = side;
        this.w = side;
        this.b = side;

    }

    Box(Box old){   // it is a copy constructor here, we are passing an old constructor, and assigning all the values
        this.l = old.l;  // to the new one
        this.w = old.w;
        this.b = old.b;

    }




}
