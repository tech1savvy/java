import java.util.HashMap;
import java.util.Map;

public class MaxFrequency {
    public static void main(String[] args) {
        String str = "example string";
        System.out.println("Most frequent character is: " + getMostFrequentChar(str));
    }

    public static char getMostFrequentChar(String str) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        char mostFrequentChar = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentChar = entry.getKey();
            }
        }

        return mostFrequentChar;
    }
}