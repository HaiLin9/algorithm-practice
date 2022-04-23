import java.util.HashMap;
import java.util.Map;

public class LeetCode169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num,0) +1);
            if(map.get(num) > nums.length/2){
                return num;
            }
        }
        return 0;
    }
}
