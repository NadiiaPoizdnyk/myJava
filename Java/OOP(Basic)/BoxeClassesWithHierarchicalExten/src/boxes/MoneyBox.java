package boxes;

class MoneyBox extends HeavyBox {
    int cost;

    // Конструирование клона объекта
    MoneyBox(MoneyBox ob) { // передача объекта конструктору
        super(ob);
        cost = ob.cost;
    }

    // Конструктор, используемый при указании всех параметров
    MoneyBox(int w, int h, int d, int m, int c) {
        super(w, h, d, m); // вызов конструктора суперкласса
        cost = c;
    }

    // Конструктор по умолчанию
    MoneyBox() {
        super();
        cost = -1;
    }

    // Конструктор для создания куба
    MoneyBox(int len, int m, int c) {
        super(len, m);
        cost = c;
    }
}