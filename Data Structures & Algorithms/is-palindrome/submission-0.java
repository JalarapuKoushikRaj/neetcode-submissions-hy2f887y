class Solution {
    public boolean isPalindrome(String s) {
        String fil="";
        String rev="";
        String start = s.toLowerCase();
        for(int i=0;i<start.length();i++)
        {
            char ch = start.charAt(i);
            if(ch>='a'&&ch<='z'||ch>='0'&&ch<='9')
            {
                fil+=ch;
            }
        }       
        for(int i=fil.length()-1;i>=0;i--)
        {
            rev+=fil.charAt(i);
        }
        return fil.equals(rev);
    }
}
