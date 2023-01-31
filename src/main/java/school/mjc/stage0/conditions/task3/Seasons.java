package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        System.out.println(month<1 || month>12
                ? "wrong number!" : month < 2 || month==12
                ? "Winter" : month < 6 ? "Spring" : month < 9
                ? "Summer" : "Autumn");
    }
}
