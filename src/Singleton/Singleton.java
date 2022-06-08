package Singleton;

public class Singleton {

    private Singleton() {

        // we want only one object of the class. only one instance is allowed for that we use singleton class
        // If you want to create only one object then you should not allow to anyone to call constructor of the class
        // so, we make it private

    }

    public static Singleton Instance; // Since this instance is not going to be dependent on the object of the parent class therefore it should be static also

    public static Singleton getInst() { // it should be static cause we are not creating object of the parent class

        if(Instance == null){    // it will run only one time cause instance variable will be null only for one time
            System.out.println("Only one time");
            Singleton.Instance = new Singleton();
        }

        return Instance;
    }
}

