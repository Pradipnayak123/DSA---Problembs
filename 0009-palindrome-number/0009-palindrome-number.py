class Solution(object):
    def isPalindrome(self, x):
        act = x
        rev =0
        while(x>0):
            rem = x%10
            rev = rev*10+rem
            x=x//10
        
        if(rev==act):
            return True
        
        else:
            return False
        """
        :type x: int
        :rtype: bool
        """
        