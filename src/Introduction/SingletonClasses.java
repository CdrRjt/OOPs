package Introduction;

public class SingletonClasses {

    int num = 0;

    private SingletonClasses(){


    }
     // we want only one object of the class. only one instance is allowed for that we use singleton class
    // If you want to create only one object then you should not allow to anyone to call constructor of the class
    // so, we make it private

    public static void main(String[] args) {
        SingletonClasses obj = new SingletonClasses();
        System.out.println(obj.num);
    }



}
