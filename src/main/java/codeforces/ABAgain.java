

import java.util.Scanner;

public class ABAgain {
    //1999.A
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nCases = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < nCases ; i++) {
            int n = scanner.nextInt();
            n = (n/10)+(n%10);
            System.out.println(n);
        }
    }
}
