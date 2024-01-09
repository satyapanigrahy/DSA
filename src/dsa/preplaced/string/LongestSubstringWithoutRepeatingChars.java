package dsa.preplaced.string;

import java.util.HashMap;
//LeetCode: 3(HashMap)
public class LongestSubstringWithoutRepeatingChars {
    public static void main(String[] args) {
        String s="awwkew";
        System.out.println(find(s));
    }

    private static int find(String s) {
        if(s.length()==0)
            return 0;
        int l=0,r=0,max=Integer.MIN_VALUE;
        HashMap<Character,Integer> hm = new HashMap<>();
        while(r<s.length()){
            char c = s.charAt(r);
            if(hm.containsKey(c))
                l = Math.max(hm.get(c)+1,l);
            hm.put(c,r);
            max = Math.max(max,(r-l+1));
            r++;
        }
        return max;
    }
}
