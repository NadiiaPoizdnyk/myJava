import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * numbers odevity verification
 */
public class OddAndEvenNumbers {
    public static void main(String[] args) {

        OddAndEvenNumbers oddAndEvenNumbers = new OddAndEvenNumbers();
        System.out.println("Numbers odevity verification." +
                "\n=============================");
        int value = oddAndEvenNumbers.enterValue(oddAndEvenNumbers);
        oddAndEvenNumbers.verifyOdevity(value);
    }




    public int enterValue(OddAndEvenNumbers n){
        Scanner scanner = new Scanner(System.in);
        int value;
        Pattern pattern = Pattern.compile("[0-9]{1,7}");
        String str;
        Matcher matcher;

        do {
            System.out.print("Type in the number: ");
            str = scanner.nextLine();
            matcher = pattern.matcher(str);
            if (!matcher.matches()) System.out.println("Sorry! Invalid value");
        }while (!matcher.matches());
        value = Integer.parseInt(str);
        return value;
    }

    public boolean verifyOdevity(int value) {

        if (value % 2 == 0){
            System.out.println("Even number");
            return true;
        }
        if (value % 2 != 0) {
            System.out.println("Odd number");
            return false;
        } else {
            return false;
        }

    }

    public boolean verifyNotANumb(String value){
        System.out.println("Sorry! Invalid value has been entered");
        return false;
    }
}


