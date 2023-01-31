package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (!(character > 64 && character < 91
                || character > 69 && character < 123)) {
            System.out.println("wrong alphabet!");
            return;
        }
        final String ch = String.valueOf(character);
        if (ch.equalsIgnoreCase("a")
                || ch.equalsIgnoreCase("e")
                || ch.equalsIgnoreCase("i")
                || ch.equalsIgnoreCase("o")
                || ch.equalsIgnoreCase("u")) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
