import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String s = scanner.nextLine();
        int quantity = 0;
        if (s.length() != 0) {
            quantity++;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    quantity++;
                }
            }
        }
        System.out.println("Количество слов в тексте равно: " + quantity);
        String[] sArray = s.split(" ");
        Map<String, Integer> repetition = new HashMap<>();
        for (String d : sArray) {
            if (repetition.containsKey(d)) {
                repetition.put(d, repetition.get(d) + 1);
            } else {
                repetition.put(d, 1);
            }
        }
        System.out.println("ТОП 10:");
        int t = 0;
        for (Map.Entry<String, Integer> a : repetition.entrySet()) {
            System.out.println(a.getKey() + " - " + a.getValue());
            t = a.getValue();
        }
    }
}
