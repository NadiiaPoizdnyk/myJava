package temperatureConverters;

public class TemperatureConverter {
    public static void main(String[] args){

        TemperatureConverter myTemp = new TemperatureConverter();
        int tempnow = myTemp.converterTemp(56, 'F');
        System.out.println(tempnow);
    }

    public int converterTemp(int temperature, char convertTo) {
        switch (convertTo) {
            case 'C':
            temperature = temperature*9/5+32;
                break;
            case 'F':
            temperature = (temperature-32)*5/9;
                break;
            default:
                System.out.println("Data error");
                break;
        }
        return temperature;
    }


}

