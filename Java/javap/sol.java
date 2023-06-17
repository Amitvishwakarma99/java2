//checking strings are anagrams or not
import java.util.*;

class sol {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s1 = ob.next();
        String s2 = ob.next();
        s2=s2.toLowerCase();
        s1=s1.toLowerCase();
        char ch;
        int n = 0, z = 0;
        int a1[] = new int[26];
        int a2[] = new int[26];
        if(s1.length()==s2.length()){
        for (char c = 'a'; c <= 'z'; c++) {
            for (int i = 0; i < s1.length(); i++) {
                ch = s1.charAt(i);
                if (c == ch) {
                    n++;
                }
            }
            //  System.out.print(n+" ");
            a1[z] = n;
            z++;
            n = 0;
        }
        // System.out.println();
        z = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            for (int i = 0; i < s2.length(); i++) {
                ch = s2.charAt(i);
                if (c == ch) {
                    n++;
                }
            }
            // System.out.print(n);
            a2[z] = n;
            z++;
            n = 0;
        }
        n=0;
        for (z = 0; z < 26; z++) {
            if (a1[z] != 0) {
                for(int j=0;j<a1[z];j++)
                {
                if (a1[z] == a2[z]) {

                    n++;
                    // System.out.println("n= "+n);
                }
                }
            }

        }
        if(n==s1.length()){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }
    }
    else{
        System.out.println("Not Anagrams");
    }
    }
}
