import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Valid_Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean check = isAnagram(str1, str2);
        System.out.println(check);
    }
    public static String sortString(String s){
        char tempArray[] =  s.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
    public static boolean isAnagram(String s, String t) {
        s = sortString(s);
        t = sortString(t);
        return s.equals(t);
    }
}
