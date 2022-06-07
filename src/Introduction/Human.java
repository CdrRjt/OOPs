package Introduction;

public class Human {

    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    Human(int age ,String name, int salary,boolean married){

        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population = population +1;
    }
}
