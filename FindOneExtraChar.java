import java.util.Arrays;

public class FindOneExtraChar {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cabcd";
        System.out.println(extraChar(s1,s2));
    }
    public static char extraChar(String s1,String s2){
       /*  Method1 
        char a1[] = s1.toCharArray();
        char a2[] = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);

        for(int i=0;i<s2.length();i++){
            if(a1[i] != a2[i])
            return a1[i];
        }
        return a2[s1.length()];
        */
       

        //Method2
        /* 
        int count[] = new int[26];
        int n = s1.length();
        for(int i=0 ; i<n ; i++){
          count[s2.charAt(i) - 'a']++;
          count[s1.charAt(i) - 'a']--;
        
        }
        count[s2.charAt(n) - 'a']++;
        for(int i=0;i<26;i++){
            if(count[i]==1)
            return (char)(i+'a');
        }
        return 0;*/


       //Method 3
        //Bitwise
        int n = s1.length();
        int res = 0;
        for(int i=0 ; i<n ; i++)
         res = res^s1.charAt(i)^s2.charAt(i);

        res = res^s2.charAt(n);
        return (char)res; 
    }
}
