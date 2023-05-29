// TASK1
enum Month {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);
    private int number;
    Month(int n) {
        number = n;
    }
    int getNumber() {
        return number;
    }
}

public class Main {
    public static void main(String[] args) {
        int number = 5;
        Month name = Month.DECEMBER;
        Month[] monthsArray = Month.values();
        for (Month i : monthsArray) {
            if (i.getNumber() == number) {
                System.out.println(i);
            }
            if (i == name) {
                System.out.println(i.getNumber());
            }
        }
    }
}



// TASK2
public class Box {
    private double width;
    private double height;
    private double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    void type() {
        if (width == height && width == depth) {
            System.out.println("Куб");
        } else if ((width == 0 && height != 0 && depth != 0) ||
                (width != 0 && height == 0 && depth != 0) ||
                (width != 0 && height != 0 && depth == 0)) {
            System.out.println("Конверт");
        } else if (width != 0 && height != 0 && depth != 0) {
            System.out.println("Обычная коробка");
        } else {
            System.out.println("Введены некорpектные размеры");
        }
    }

    public static void main(String[] args) {
        Box mybox1 = new Box(6, 8, 5);
        Box mybox2 = new Box(7, 5, 0);
        Box mybox3 = new Box(0, 0, 7);
        mybox1.type();
        mybox2.type();
        mybox3.type();
    }
}
