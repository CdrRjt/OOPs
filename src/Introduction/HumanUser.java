package Introduction;

public class HumanUser {

    public static void main(String[] args) {
        Human Rajat = new Human(18,"Rajat Kumar",0,false);
        System.out.println(Rajat.population);
        Human Ashutosh = new Human(20,"Ashutosh Tiwari",10000,false);
        Human  Ayush = new Human(18,"Ayush Singh Negi",0,false);
        System.out.println(Ayush.population);
        System.out.println(Human.population);
        System.out.println(Ashutosh.population);  // without using static keyword it will print 1
        // but using static keyword it will print 2

        // you could have a doubt like why it is printing 2 2 and not 1 2 its because we have created the objects
        // before printing

       // greeting(); // here it is showing error cause we are using/calling a non static function inside a static
        // function which is not possible as it depends on instance whereas main function does not.
        //we cannot access non static stuff without refering it to an object in a static context

    }

    void greeting(){

        System.out.println("arigato");
    }

    static void fun(){
       HumanUser obj = new HumanUser();  // Now it works cause here we have created an object
       obj.greeting();
    }

    void fun2(){
        greeting();  // but we can run a non static data inside a non static data but still need an object to run
    }
}
