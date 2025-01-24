package codeforces;

import java.util.*;
public class EvenOdds {
    //Problem - 318A
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long integerN;
        Long integerK;
        integerN = scanner.nextLong();
        integerK = scanner.nextLong();
        Long odd = (integerN+1)/2;

        if(integerK>odd){
            System.out.println(""+(integerK-odd)*2);
        }else {
            System.out.println(""+((2*integerK)-1));
        }
    }
}