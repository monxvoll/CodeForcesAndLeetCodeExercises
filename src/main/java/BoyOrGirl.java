import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        List<Character> list = new ArrayList<>();
        int charactersNumber = 0;

        for (int i = 0; i <= userName.length()-1 ; i++) {
            char letter = userName.charAt(i);
           if(!list.contains(letter)){
               charactersNumber++;
               list.add(letter);
           }
        }
        if(charactersNumber%2==0){
            System.out.println("CHAT WITH HER!");
        }else {
            System.out.println("IGNORE HIM!");
        }
    }
}
