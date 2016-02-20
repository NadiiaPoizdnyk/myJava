package boxes;

class Box {
    private int width;
    private int height;
    private int depth;

    // Конструктор для создания клона объекта
    Box(Box ob) { // передача объекта конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // Конструктор, используемый при указании всех измерений
    Box(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }

    // Конструктор, используемый, когда ни одно из измерений не указано
    Box() {
        // значение -1 используется для указания неинициализированного параллелепипеда
        width = -1;
        height = -1;
        depth = -1;
    }

    // Конструктор для создания куба
    Box(int len) {
        width = height = depth = len;
    }

    // вычисляем объём коробки
    int getVolume() {
        return width * height * depth;
    }
}