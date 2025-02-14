import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Solution_twosum {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int ptu = sc.nextInt();
            nums.add(ptu);
        }
        int target = sc.nextInt();
        sc.close();
        twoSum(nums, target);
    }
    public static void twoSum(ArrayList<Integer> nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.size(); i++){
            int key = target - nums.get(i);
            if(map.containsKey(key)){
                System.out.println(map.get(key) +  " " + i);
                return;
            }
            else{
                map.put(nums.get(i), i);
            }
        }
        System.out.println("-1 -1");
        return;
    }
}