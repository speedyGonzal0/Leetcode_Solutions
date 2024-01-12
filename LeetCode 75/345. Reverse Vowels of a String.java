class Solution {
    public String reverseVowels(String s) {
        char[] letters = s.toCharArray();
        int i = 0;
        int j = letters.length - 1;

        StringBuilder sb = new StringBuilder();

        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        while (i <= j) {
            while (!vowels.contains(letters[i]) && i < j) {
                sb.append(letters[i]);
                i++;
            }
            while (!vowels.contains(letters[j]) && j > i) {
                j--;
            }

            char temp = letters[i];
            letters[i] = letters[j];
            letters[j] = temp;
            sb.append(letters[i]);
            i++;
            j--;
        }

        while (i < letters.length){
            sb.append(letters[i]);
            i++;
        }

        return sb.toString();
    }
}