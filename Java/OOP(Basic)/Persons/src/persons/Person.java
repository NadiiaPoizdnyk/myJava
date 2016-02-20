package persons;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {

    String firstName;
    String middleName;
    String lastName;
    int birthYear;
    int currentYear = 2016;


    void setInfo(String  fn, String  mn, String ln){

        Scanner scanner = new Scanner(System.in);
        String string = null;
        Pattern pattern = Pattern.compile("[A-Za-z]{15}");
        Matcher matcher = null;

        do {
            System.out.println("Type");
        }
    }

    void setFullName(String  fn, String  mn, String ln){
        firstName = fn;
        middleName = mn;
        lastName = ln;
    }

    String getFullName(){
        return firstName + middleName + lastName;
    }
    int getAge(){
        return currentYear - birthYear;
    }
/*
    public String getInfo(){

        System.out.println();

    }



    }
    */
}
