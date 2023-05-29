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


