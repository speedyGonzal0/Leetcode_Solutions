class Solution {
    public boolean isValid(String s) {
        Stack<Character> parantheses = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '['){
                parantheses.push(c);
            }
            else if (!parantheses.isEmpty()){
                char closing = parantheses.pop();
                if (c == ')' && closing != '(' || c == '}' && closing != '{' || c == ']' && closing != '[' ){
                    return false;
                }
            }
            else {
                return false;
            }
        }
        return parantheses.isEmpty();
    }
}