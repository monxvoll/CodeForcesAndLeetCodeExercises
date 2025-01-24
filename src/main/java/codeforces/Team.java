package codeforces;

import java.util.Scanner;

public class Team {
    //Problem - 231A
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contestNumber,petyaView,vasyasView,tonyaView,problemsNumber = 0;
        contestNumber = scanner.nextInt();

        for (int i = 0; i < contestNumber ; i++) {
            petyaView = scanner.nextInt();
            vasyasView = scanner.nextInt();
            tonyaView = scanner.nextInt();
            if((petyaView+vasyasView+tonyaView)>=2){
                problemsNumber++;
            }
        }
        System.out.println(problemsNumber);
    }
}
