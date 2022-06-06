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
        Student Rajat = new Student();
        Rajat.rollNo = 69;
        Rajat.name = "Rajat Kumar";
        Rajat.marks = 91.8f;
        System.out.println(Rajat.rollNo);
        System.out.println(Rajat.name);
        System.out.println(Rajat.marks);
    }


}

class Student{
    int rollNo;
    String name;
    float marks;
}
