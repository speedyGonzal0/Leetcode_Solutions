class Solution {
    public int compress(char[] chars) {
        StringBuilder s = new StringBuilder();
        int count = 0;
        char currChar = chars[0];

        for (int i = 0; i < chars.length; i++) {
            if (currChar == chars[i]) {
                count++;
            }
            else if (currChar != chars[i]) {
                s.append(currChar);

                if (count > 1) {                    
                    for (char c : String.valueOf(count).toCharArray()) {
                        s.append(c);
                    }
                }

                count = 1;
                currChar = chars[i];                
            }
            
            if (i == chars.length - 1) {
                s.append(currChar);
                if (count > 1) {
                    for (char c : String.valueOf(count).toCharArray()) {
                        s.append(c);
                    }
                }   
            }
        }

        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        return s.length();
    }
}