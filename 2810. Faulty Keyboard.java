class Solution {
    public String finalString(String s) {
        StringBuilder finalString = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c != 'i') {
                finalString.append(c);
            } else {
                finalString.reverse();
            }
        }

        return finalString.toString();
    }
}