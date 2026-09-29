class Solution {

    public boolean alphaNum(char c){
        return (c >='0' && c <='9'||
                c >='A' && c <='Z'||
                c >='a' && c <='z'
        );
    }


    public boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;

        while (i <j){
            while(i<j && !alphaNum(s.charAt(i))){
                i ++;
            }
            while (i<j && !alphaNum(s.charAt(j))){
                j --;
            }

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i ++; j--;
        }
        return true;

    }
}
