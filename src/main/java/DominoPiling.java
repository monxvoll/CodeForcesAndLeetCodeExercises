import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstGivenInteger = scanner.nextInt();
        int secondGivenInteger = scanner.nextInt();
        System.out.println((firstGivenInteger*secondGivenInteger)/2);
    }
}
