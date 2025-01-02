import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Character> poles = new ArrayList<>();
        int n = scanner.nextInt();
        scanner.nextLine();
        int result = 1;
        int iteratorA = 1;
        int iteratorB = 2;
        
        for (int i = 0; i < n ; i++) {
            String pole = scanner.nextLine();
            char poleA = pole.charAt(0);
            char poleB = pole.charAt(1);
            poles.add(poleA);
            poles.add(poleB);
            if(poles.size()==4){
                if((poles.get(iteratorA))==(poles.get(iteratorB))){
                    result++;
                }
            } else if (poles.size()>4) {
                iteratorA = iteratorA+2;
                iteratorB = iteratorB+2;
                if((poles.get(iteratorA))==(poles.get(iteratorB))){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
