import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class contains_duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            nums.add(sc.nextInt());
        }
        boolean check = containsDuplicate(nums, n);
        System.out.println(check);
    }
    public static boolean containsDuplicate(ArrayList<Integer> nums, int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(nums.get(i))){
                return true;
            }
            else{
                map.put(nums.get(i), 1);
            }
        }
        return false;
    }

}
