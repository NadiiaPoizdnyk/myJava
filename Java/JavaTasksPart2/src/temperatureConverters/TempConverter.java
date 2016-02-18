package temperatureConverters;

import java.io.IOException;


public class TempConverter {
    public static void main(String[] args) throws IOException {

        TempConverter rc = new TempConverter();
        String yourTemp = rc.convertTemp(88, 'F');
        System.out.println(yourTemp);

    }

    public String convertTemp(int temperature, char convertTo) {

        String value = null;
        double convertTemp = 0;

        if (convertTo == 'F') {
            convertTemp = temperature * 9 / 5 + 32;

        } else if (convertTo == 'C') {
            convertTemp = (temperature - 32) * 5 / 9;
        }

        value = String.valueOf(convertTemp);

        return value;
    }
}
