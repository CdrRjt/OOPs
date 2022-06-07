package Introduction;

public class Main {

    public static void main(String[] args) {
        //teacher says store roll no.
        int[] rol = new int[5];

        // teacher says to store name
        String[] names = new String[5];

        // Now teacher says to store data i.e. roll no. as well as name
        // so we will create a class
        //  Student Rajat; // here we are declaring the object . This is just a reference to an object of type student
       // Rajat.name;    //  in the stack memory

        // To create objects use new keyword which dynamically allocates memory at the runtime and returns reference
        // variable to it.
        Student kunal = new Student();
        Student Rajat = new Student(kunal);

//        Rajat.rollNo = 69;
//        Rajat.name = "Rajat";
////        Rajat.marks = 91.8f;
        Rajat.greeting();
        Rajat.nameChange("");
        System.out.println(Rajat.rollNo);
        System.out.println(Rajat.name);
        System.out.println(Rajat.marks);

        Student one  = new Student();
        Student two = one;

        one.name = "ChagMug patther";
        System.out.println(two.name);

    }


}

class Student{

    int rollNo;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello bro whats up" + this.name);
    }

    // This is how we call a constructor from other constructor

    Student(){

//        this.rollNo = 0;   // here this keyword is ,kunal the reference variable that we have called and
//        this.name = "Rjt"; // is internally considered as kunal.For every pass this is replaced by the reference
//        this.marks = 0.0f; // variable that we have called
 // Here this refers to the student constructor below
        this (12,"fasdfsa",89.99f);

    }                              // whenver you call a constructor with three vaibles it will call the
    void nameChange(String name){  // below constructor and when you call it without variables then it will call above
        this.name = name;          // one   This is known as constructor overloading
    }

    Student(int roll, String naam, float markss){

        this.rollNo = roll; // here we can use different name or we can use same na
        this.name = naam;   // this keyword is nothing but when ever we call a reference varible or an object
        this.marks = markss; // like kunal or rahul , internally this is replaced by kunal and rahul

    }

    Student(Student other){

        this.name = other.name;
        this.marks = other.marks;
        this.rollNo = other.rollNo;
    }




}
