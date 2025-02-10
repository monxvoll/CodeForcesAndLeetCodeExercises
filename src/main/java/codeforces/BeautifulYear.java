package codeforces;

import java.util.*;

public class BeautifulYear {
    //Problem - 271A
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String year = scanner.nextLine();
        findValidYear(Integer.parseInt(year));
    }

    private static void findValidYear(int year) {
        Set<String> values = new HashSet<>();
        String newYear = String.valueOf(year + 1);
        for (int i = 0; i < newYear.length(); i++) {
            String aux = String.valueOf(newYear.charAt(i));
            values.add(aux);
        }
        if(values.size()<newYear.length()){
            findValidYear(Integer.parseInt(newYear));
        }else {
            System.out.println(newYear);
        }
    }
}
