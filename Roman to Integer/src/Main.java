import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter Roman Number");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Solution solution = new Solution();
        System.out.println("Your number in decimal is "  + solution.romanToInt(s));
    }
}