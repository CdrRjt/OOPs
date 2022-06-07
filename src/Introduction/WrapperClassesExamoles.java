package Introduction;

public class WrapperClassesExamoles {

    public static void main(String[] args) {
        int a= 10;
        Integer num = 45;
        Integer num2 = 55;

        swap(num, num2);
        System.out.println(num);
        System.out.println(num2);
    }



    public static void swap(Integer a , Integer b) {
        int temp = a;
        a = b;
        b = temp;
    }

}

class A {

    final int a = 44;
    String name;

    public A(String name){
        this.name = name;
    }

}
