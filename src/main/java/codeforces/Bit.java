package codeforces;

import java.util.Scanner;

public class Bit{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int statementsNum = scanner.nextInt();
        scanner.nextLine();
        int xValue = 0;

        for (int i = 0; i < statementsNum; i++) {
            String statement = scanner.nextLine();
            if(statement.contains("-")){
                xValue --;
            }else if (statement.contains("+")) {
                xValue ++;
            }
        }
        System.out.println(xValue);
    }
}
