package dsa.preplaced.string;

import java.util.HashSet;
//Leet Code: 3(HashSet)
public class LongestSubStringWithoutRepeatingChars2 {
    public static void main(String[] args) {
        String s="abcaabcdbb";
        System.out.println(find(s));
    }

    private static int find(String s) {
        if(s.length()==0)
            return 0;
        HashSet<Character> hs = new HashSet<>();
        int i=0,j=0,max = Integer.MIN_VALUE;
        while (i<s.length()){
            char c = s.charAt(i);
            while (hs.contains(c)){
                hs.remove(s.charAt(j));
                j++;
            }
            hs.add(c);
            max = Math.max(max,(i-j+1));
            i++;
        }
        return max;
    }
}
