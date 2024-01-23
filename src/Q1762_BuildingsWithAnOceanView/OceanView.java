package Q1762_BuildingsWithAnOceanView;

import java.util.Stack;

public class OceanView {
    public static int[] findBuildings(int[] heights) {
        int maxHeight = 0, count = 0;
        Stack<Integer> result = new Stack<>();
        for(int i = heights.length-1; i>=0; i--){
            if(heights[i]>maxHeight){
                result.push(i);
                maxHeight = heights[i];
                count++;
            }
        }
        int[] results = new int[result.size()];
        for(int i = 0; i<count; i++){
            results[i] = result.pop();
        }
        return results;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,3,1};
        int result[] = findBuildings(arr);
        for(int val: result){
            System.out.println(val);
        }
    }
}
