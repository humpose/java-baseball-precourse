package Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//난수 생성 기능
public class RandomNumberGenerator {
    public static List<Integer> generateUniqueNumbers() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        return numbers.subList(0, 3);
    }
}