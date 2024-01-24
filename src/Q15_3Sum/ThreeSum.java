package Q15_3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {
     public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result2 = new ArrayList<>();
        HashMap<List<Integer>, Integer> dups = new HashMap<>(); 
        for(int j=0; j<nums.length-2;j++){
            if(j>0 && nums[j]==nums[j-1])continue;
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            int target = -1*nums[j];
            for(int i = j+1; i<nums.length; i++){             
                if(hashMap.containsKey(nums[i])){
                    List<Integer> result = new ArrayList<>();
                    result.add(nums[j]);
                    result.add(nums[i]);
                    result.add(hashMap.get(nums[i]));
                    Collections.sort(result);
                    if(!dups.containsKey(result)){
                        result2.add(result);   
                        dups.put(result,0);
                    }
                               
                }else{
                    hashMap.put(target-nums[i],nums[i]);
                }
            }
        }        
        return result2;
    }
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum(arr);
        for(List<Integer> val: result){
            System.out.println(val);
        }
    }
}
