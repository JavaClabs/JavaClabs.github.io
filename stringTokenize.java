import java.util.Scanner;
import java.util.StringTokenizer;

public class stringTokenize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter a series of integers separated by spaces:");
        String input = scanner.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(input);
        int sum = 0;
        int i = 1;
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            int num = Integer.parseInt(token);
            System.out.println("["+i+"] Value : " + num);
            sum += num;
            i += 1;
        }
        System.out.println("Sum of all integers: " + sum);
    }
}
