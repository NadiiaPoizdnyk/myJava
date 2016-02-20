package animals;

public class Main {
    public static void main(String[]args){

        Anim anim1 = new Anim();
        Anim anim2 = new Anim();
        Anim anim3 = new Anim();

        anim1.animal = "The goat";
        anim1.name = "Tutti";
        anim1.age = 3;

        anim2.animal = "The cow";
        anim2.name = "Luna";
        anim2.age = 4;

        anim3.animal = "The piggy";
        anim3.name = "Petra";
        anim3.age = 2;


        System.out.println("The grandmother has:");
        System.out.println(anim1.animal + " " + anim1.name + " " + anim1.age + " years.");
        System.out.println(anim2.animal + " " + anim2.name + " " + anim2.age + " years.");
        System.out.println(anim1.animal + " " + anim3.name + " " + anim3.age + " years.");

        anim1.saySomething("Meeee");
        anim1.saySomething(2);
        anim1.saySomething(2,1);

        anim2.saySomething("Muuu");
        anim2.saySomething(3);
        anim2.saySomething(3,2);

        anim3.saySomething("Wuiii");
        anim3.saySomething(1);
        anim3.saySomething(4,3);
    }
}
