package codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BattleForSurvive {
    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();
        List<Long> listB = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int numberOfFighters = scanner.nextInt();
            for (int j = 0; j < numberOfFighters; j++) {

                Long fighter = scanner.nextLong();
                list.add(fighter);

                if(list.size()==numberOfFighters){
                    Long sum = 0L;
                    for (int k = list.size()-2; k >=0 ; k--) {
                        if(k==(list.size()-2)) {
                            sum -=-(list.get(k));
                        }else{
                            sum -=(list.get(k));
                        }
                    }
                   Long result = list.get(numberOfFighters-1) - sum   ;
                   listB.add(result);
                   list.clear();
                }
            }
        }

        for (Long num : listB){
            System.out.println(num);
        }
    }
}

