package RemoveOuterParanthesis_1021;
class Solution {
    public static String removeOuterParentheses(String s) {
        String result = new String();
        int length = s.length();
        int count = 0;
        for(int i=0; i< length; i++){
            // int prev = count;
            // if(s.charAt(i) == '('){
            //     count++;
            // }else{
            //     count--;
            // }
            // if((prev == 0 && count ==1) || (count == 0 && prev == 1)) continue;
            // result = result + s.charAt(i);
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