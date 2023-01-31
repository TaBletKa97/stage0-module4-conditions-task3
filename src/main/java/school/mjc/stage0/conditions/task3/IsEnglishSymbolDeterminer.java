package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        System.out.println(symbol > 64 && symbol < 91 || symbol > 69 && symbol < 123
                ? "English" : "Non English");
    }
}
