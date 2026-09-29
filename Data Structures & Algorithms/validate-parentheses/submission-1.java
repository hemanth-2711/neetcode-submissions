class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack <>();
        Map <Character, Character> CtoO = new HashMap <>();
        CtoO.put(')', '(');
        CtoO.put(']', '[');
        CtoO.put('}', '{');

        for (char c : s.toCharArray()){
            if (CtoO.containsKey(c)){
                if (!stack.isEmpty() && stack.peek() == CtoO.get(c)){
                    stack.pop();
                } 
                else{
                    return false;
                }
            }
            else{
                stack.push(c);
            }

        }
        return stack.isEmpty();

    }
}
