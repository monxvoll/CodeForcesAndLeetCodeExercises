package codeforces;

import java.util.Scanner;

public class HitTheLottery {
    //Problem - 996A
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int allenMoney = scanner.nextInt();
        int minimumNumberOfBills = 0;

        while (allenMoney > 0) {
            if (allenMoney >= 100) {
                minimumNumberOfBills += allenMoney / 100;
                allenMoney = allenMoney % 100;
            } else if (allenMoney >= 20) {
                minimumNumberOfBills += allenMoney / 20;
                allenMoney = allenMoney % 20;
            } else if (allenMoney >= 10) {
                minimumNumberOfBills += allenMoney / 10;
                allenMoney = allenMoney % 10;
            } else if (allenMoney >= 5) {
                minimumNumberOfBills += allenMoney / 5;
                allenMoney = allenMoney % 5;
            } else  {
                minimumNumberOfBills += allenMoney;
                allenMoney = 0;
            }
        }
        System.out.println(minimumNumberOfBills);
    }
}