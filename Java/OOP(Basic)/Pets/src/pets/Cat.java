package pets;

public class Cat extends Pet{

    int birthday;

    Cat(int i, int j){
        age = i;
        birthday = j;
    }

    Cat(int i){
        age = i;            // this(i, i);
        birthday = i;
    }

    Cat(){
        age = 0;            // this(0);
        birthday = 0;
    }
}
