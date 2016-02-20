package boxes;


public class Main {
    public static void main(String[] args) {
        MoneyBox moneybox1 = new MoneyBox(100, 200, 150, 100, 300);
        MoneyBox moneybox2 = new MoneyBox(20, 30, 40, 7, 10);

        int vol;
        vol = moneybox1.getVolume();
        System.out.println("Объем первой коробки: " + vol);
        System.out.println("Вес первой коробки: " + moneybox1.weight);
        System.out.println("Цена коробки: " + moneybox1.cost);

        vol = moneybox2.getVolume();
        System.out.println("\nОбъем второй коробки: " + vol);
        System.out.println("Вес второй коробки: " + moneybox2.weight);
        System.out.println("Цена коробки: " + moneybox2.cost);
    }
}
