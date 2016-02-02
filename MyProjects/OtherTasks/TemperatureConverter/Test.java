import java.io.IOException;


public class Test {
    public static void main(String[] args) throws IOException {

        Test rc = new Test();
        String yourTemp = rc.convertTemp(88, 'F');
        System.out.println(yourTemp);

    }

    public String convertTemp(int temperature, char convertTo) {

        String value = null;
        float convertTemp = 0;

        if (convertTo == 'F') {
            convertTemp = temperature * 9 / 5 + 32;

        } else if (convertTo == 'C') {
            convertTemp = (temperature - 32) * 5 / 9;
        }

        value = String.valueOf(convertTemp);

        return value;
    }
}
