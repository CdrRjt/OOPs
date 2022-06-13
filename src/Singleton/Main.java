package Singleton;

public class Main {

    public static void main(String[] args){
     //   Singleton obj = new Singleton(); // it is showing error cause the constructor is private

     // so we create a function that returns singleton type instance

        Singleton obj = Singleton.getInst();  // but here it is saying it is non static
                 // because we are calling it via class name and it should be static
        Singleton obj2 = Singleton.getInst();
        Singleton obj3 = Singleton.getInst();
        Singleton obj3u = Singleton.getInst();
        Singleton obj3g= Singleton.getInst();
        Singleton obj3za = Singleton.getInst();

        // all these reference variable are pointing towards same object

    }
}
