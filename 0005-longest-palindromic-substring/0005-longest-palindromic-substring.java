class Solution {
    int lower=0,Maxend=0;
    public String longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        if(s.length() < 2)
        {
            return s;
        }

        for(int i=0;i<arr.length;i++)
        {
            lengthpalindrome(arr,i,i); //odd
            lengthpalindrome(arr,i,i+1); //even
        }
        return s.substring(lower,lower+Maxend);
    }
    public void lengthpalindrome(char[] s,int x,int y)
    {
        while(x>=0 && y<s.length && s[x]==s[y])
        {
            x--;
            y++;
        }
        if(Maxend < y-x-1)
        {
            Maxend = y-x-1;
            lower=x+1;
        }
    }
}