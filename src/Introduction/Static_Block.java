package Introduction;

public class Static_Block {

     static int a = 5;
     static int b;

     static{

         System.out.println("Hello World");
         b = a*4;
     }


    public static void main(String[] args) {
        Static_Block obj = new Static_Block();

        System.out.println(obj.b);
        
        obj.b = obj.b + 5;  // it shows that the static block is only loaded once,whenever the class is loaded
                            // for the first time
        System.out.println(obj.b);
    }
}
