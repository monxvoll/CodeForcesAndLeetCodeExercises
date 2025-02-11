package leetcode;

import java.util.Arrays;

public class FindContentChildren {
//455. Assign Cookies
     class Solution {
        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(s); Arrays.sort(g);
            int n = 0;
            for (int i = 0; i < s.length; i++) {
                for ( int j = n; j < g.length; j++) {
                    if(s[i]>=g[j]){
                        n++;
                        break;
                    }
                }
            }
            return n;
        }
    }
}
