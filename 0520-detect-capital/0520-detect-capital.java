class Solution {
    public boolean detectCapitalUse(String word) {
        int uppercase = 0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                uppercase++;
            }
        }
        return uppercase == word.length() // All word are UpperCase
        || uppercase == 0 // all are in lowercase
        || (uppercase == 1 && Character.isUpperCase(word.charAt(0))); // First Latter is Capital
    }
}