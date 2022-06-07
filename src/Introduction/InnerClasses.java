package Introduction;

public class InnerClasses {

    static class Test{

       static String name;
         Test(String name){
             this.name = name;
         }

    }

    public static void main(String[] args) {
        Test a = new Test("Rajat"); // here it is giving error cause it depends upon the InnerClass instance
        // but by using static keyword for Test class it becomes independent of object of innerclass
        Test b = new Test("Ayush");
        System.out.println(a.name);
        System.out.println(b.name);  // Now here it prints ayush ayush cause String name is static
    }
}
