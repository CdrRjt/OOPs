package Inheritance;

public class Main {

    public static void main(String[] args){

//        Box box = new Box(5);
//        System.out.println(box.l + " " + box.w+ " " + box.b);

          BoxWithWeight box2 = new BoxWithWeight(4,5);
        System.out.println(box2.l + " " + box2.weight);


        Box box3 = new BoxWithWeight();  // one can have a doubt like here the box constructor is not called and all ,
        System.out.println(box3.l);
        System.out.println(); // Here it is showing error cause
    // we can only access the variables of the reference type and not of the object type, even if we have
    // initialised the weight variable. It is like a reference variable of box type in stack is refering to
    // object of BoxWithWeight type in the heap memory.

        // But now

      //  BoxWithWeight box4 = new Box();
    // here it is showing error cause we can access the variables of BoxWithWeight type but the weight variable cannot
    //  be initialised as the boxWeight constructor is never called hence the weight variable is never initialised
    // Because the parent class does not know about members of child class

        //weight variable hence error.

    /*  Multilevel Inheritance  */

        BoxPrice abox = new BoxPrice();
        System.out.println(abox.l);
    }
}
