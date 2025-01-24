package codeforces;

import java.util.Scanner;
public class TenzingAndTsondu {
    //Problem - 1842A
        public static void main(String args[]) {
            Scanner scanner = new Scanner(System.in);
            int rounds = scanner.nextInt();

            for(int i = 0 ; i<rounds; i++){
                int nTsonduMonsters = scanner.nextInt();
                int mTenzingMonsters = scanner.nextInt();
                long[] array = new long[nTsonduMonsters];
                long[] arrayTwo = new long[mTenzingMonsters];
                int sumTsondu = 0;
                int sumTenzing= 0;
                saveMonsters(array,arrayTwo,nTsonduMonsters,mTenzingMonsters,scanner);
                calculateSums(sumTsondu,sumTenzing,array,arrayTwo);
            }
        }

    private static void saveMonsters(long[] array,long[] arrayTwo ,long nTsonduMonsters, long mTenzingMonsters,Scanner scanner) {
        for (int j = 0; j < nTsonduMonsters; j++) {
            array[j] = scanner.nextInt();
        }
        for (int k = 0; k < mTenzingMonsters; k++) {
            arrayTwo[k] = scanner.nextInt();
        }
    }

    private static void calculateSums(long sumTsondu,long sumTenzing,long[] array,long[] arrayTwo ){
        for (int z = 0; z <= array.length-1; z++) {
            sumTsondu += array[z];
        }
        for (int w = 0; w <= arrayTwo.length-1; w++) {
            sumTenzing += arrayTwo[w];
        }
        showResult(sumTsondu,sumTenzing);
    }

    private static void showResult(long sumTsondu,long sumTenzing){
        if(sumTsondu>sumTenzing){
            System.out.println("Tsondu");
        } else if (sumTsondu<sumTenzing) {
            System.out.println("Tenzing");
        }else {
            System.out.println("Draw");
        }
    }
}
