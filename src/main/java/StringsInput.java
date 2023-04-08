import java.util.Scanner;

public class StringsInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество строк:");
        int n = scanner.nextInt();
        scanner.nextLine();

        String maxDistinctCharsString = null;
        int maxDistinctCharsCount = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Строка " + i + ":");
            String input = scanner.nextLine();

            int distinctCharsCount = 0;

            for (int j = 0; j < input.length(); j++) {
                boolean isDistinct = true;
                for (int k = 0; k < j; k++) {
                    if (input.charAt(j) == input.charAt(k)) {
                        isDistinct = false;
                        break;
                    }
                }
                if (isDistinct) {
                    distinctCharsCount++;
                }
            }

            if (distinctCharsCount > maxDistinctCharsCount) {
                maxDistinctCharsCount = distinctCharsCount;
                maxDistinctCharsString = input;
            }
        }
        
        System.out.println("Ответ: " + maxDistinctCharsString);
    }
}