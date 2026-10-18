class Solution {
    public boolean isPalindrome(int x) {
      int  actualNum = x;
        int rev = 0;
        while(x>0){
          int  digit = x % 10;
            rev = rev*10+digit;
            x=x/10;
        }
        if(rev == actualNum){
            return true;
        }
        else{
            return false;
        }
        
    }
    public void main(String[] args){
        int num = 121;
        isPalindrome(num);
    }
}