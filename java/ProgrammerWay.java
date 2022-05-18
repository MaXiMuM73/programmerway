import java.util.ArrayList;
import java.util.List;

public class ProgrammerWay {

    public static final int RONALDO = 7;

    public static void main(String[] args) {
        // Создал коллекцию
        List<Integer> numbers = new ArrayList<>();

        // Заполнил коллекцию
        int i = 1;
        do {
            numbers.add(i);
            i++;
        } while (i < 11);

        // Просканировал, если нашел 7 - вывел в консоль
        numbers.forEach(number -> {
            System.out.println(number);
            if (number.equals(RONALDO)) System.out.println("Ronaldo");
        });

        System.out.println("Test");
    }
}
