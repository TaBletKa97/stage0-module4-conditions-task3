package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        switch (month) {
            case 1, 3, 5, 8, 10, 12 -> System.out.println(31);
            case 2 -> System.out.println(28);
            case 4, 6, 7, 9, 11 -> System.out.println(30);
            default -> System.out.println("wrong number!");
        }
    }
}
