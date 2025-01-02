
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class HelpFulMaths {
    static List<Integer> extractedNumbers = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();

        for (int i = 0; i < operation.length() ; i+=2) {
            char number = operation.charAt(i);
            extractedNumbers.add(number - '0');
        }
        sortAscending();
        for (int i = 0; i < extractedNumbers.size(); i++) {
            if(i<extractedNumbers.size()-1) {
                System.out.print(extractedNumbers.get(i) + "+");
            }else {
                System.out.print(extractedNumbers.get(i) );
            }
        }
    }

    public static void sortAscending(){
        for (int i = 0; i < extractedNumbers.size()-1; i++) {
            int prev=extractedNumbers.get(i);
            int pos=extractedNumbers.get(i+1);
            if(prev>pos){
                extractedNumbers.set(i,pos);
                extractedNumbers.set(i+1,prev);
                sortAscending();
            }
        }
    }
}
