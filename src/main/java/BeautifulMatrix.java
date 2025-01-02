import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[5][5];
        int numberOfMoves = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int temp = scanner.nextInt();
                array[i][j]= temp;
                if(temp==1){
                    numberOfMoves = Math.abs(i - 2) + Math.abs(j - 2);
                }
            }
        }
        System.out.println(numberOfMoves);
    }
}
