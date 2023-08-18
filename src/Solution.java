import java.util.Arrays;

class Solution {
    public String sortVowels(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(isVowel(s.charAt(i)))
                sb.append(s.charAt(i));
        }

        char[] arr = sb.toString().toCharArray();

        sb.setLength(0);
        Arrays.sort(arr);

        int j = 0;
        for(int i = 0; i < s.length(); i++){
            if(isVowel(s.charAt(i))){
                sb.append(arr[j]);
                j++;
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();

    }

    public boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch =='U';
    }
}
