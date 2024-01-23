package Q1021_RemoveOuterParanthesis;
class Solution {
    public static String removeOuterParentheses(String s) {
        String result = new String();
        int length = s.length();
        int count = 0;
        for(int i=0; i< length; i++){
    // Using 2 Variables
            // int prev = count;
            // if(s.charAt(i) == '('){
            //     count++;
            // }else{
            //     count--;
            // }
            // if((prev == 0 && count ==1) || (count == 0 && prev == 1)) continue;
            // result = result + s.charAt(i); 
    //Optimize using single variable.  
            // result = result + s.charAt(i); 
    //Optimize using single variable.
            if(s.charAt(i) == '('){
                if(count>0) result = result + s.charAt(i);
                count++;
            }else{
                if(count>1) result = result + s.charAt(i);
                count--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String S = "(()())(())()";
        System.out.print(removeOuterParentheses(S));
    }
}