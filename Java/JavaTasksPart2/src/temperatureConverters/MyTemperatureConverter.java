package temperatureConverters;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MyTemperatureConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = null, string1 = null, string2 = null;
        int a = 0, b = 0, c = 0;
        double temperature;
        Pattern pattern = Pattern.compile("[1-2]{1}");                                      //1-2
        Pattern pattern1 = Pattern.compile("(\\-)?([1]{1})?\\d{1}|(\\-)?[2]{1}[0]{1}|" +    //-20 - +220
                "([1]{1})?\\d{2}|[2]{1}[0-1]{1}\\d{1}|[2]{2}[0]{1}");
        Pattern pattern2 = Pattern.compile("(\\-)?([1-2]{1})?\\d{1}|(\\-)?[3]{1}[0]{1}|\\d{2}|[1]{1}[0]{2}");  //-30 - +100
        Matcher matcher = null, matcher1 = null, matcher2 = null;

        do {
            System.out.println("Please, select the temperature type.");
            System.out.print("1 - by Fahrenheit; 2 - by Celsius. Make your choice: ");
            string = scanner.nextLine();
            matcher = pattern.matcher(string);
            if (!matcher.matches()) System.out.println("Error! Invalid value has been entered");
            System.out.println("\n");
        } while (!matcher.matches());

        a = Integer.parseInt(string);

        switch (a) {
            case 1:     //converts from F to C
                do {
                    System.out.print("Please, typ in the temperature: ");
                    string1 = scanner.nextLine();
                    matcher1 = pattern1.matcher(string1);
                    if (!matcher1.matches()) System.out.println("Error! Invalid value has been entered");
                    System.out.println("\n");
                } while (!matcher1.matches());

                b = Integer.parseInt(string1);
                temperature = (b - 32) * 5 / 9;
                System.out.println(b + " F = " + temperature + " C");
                break;

            case 2:     //converts from C to F
                do {
                    System.out.print("Please, typ in the temperature: ");
                    string2 = scanner.nextLine();
                    matcher2 = pattern2.matcher(string2);
                    if (!matcher2.matches()) System.out.println("Error! Invalid value has been entered");
                    System.out.println("\n");
                } while (!matcher2.matches());

                b = Integer.parseInt(string2);
                temperature = b * 9 / 5 + 32;
                System.out.println(b + " C = " + temperature + " F");
                break;
        }
        scanner.close();
    }
}
