package pets;

public class Fish extends Pet {

    int currentDepth = 0;

    public int dive(int howDeep){
        currentDepth = currentDepth + howDeep;
        System.out.println("Ныряю на глубину " + howDeep + " футов");
        System.out.println("Я на глубине " + currentDepth + " футов ниже уровня моря");
        return currentDepth;
    }

    /*

    Fish(int currentDepth){  //параметр метода
        this.currentDepth = currentDepth;  // this.currentDepth (поле объекта)  = currentDepth (параметр метода)
    }
        /*
        this.currentDepth ссылается на атрибут класса currentDepth,
        в то время как currentDepth ссылается на значение аргумента конструктора.

        указатель на объект из которого он был вызван т.е. словами,экземпляр класса Fish указывает
        на самого себя с помощью cлова this.
        используется во избежание конфлитка имен
         */
}