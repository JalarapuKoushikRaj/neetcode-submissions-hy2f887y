class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        for(int i=0;i<s1.length;i++)
        {
            for(int j=0;j<s1.length-1;j++)
            {
                if(s1[j]>s1[j+1])
                {
                    char temp = s1[j];
                    s1[j]=s1[j+1];
                    s1[j+1]=temp;
                }
            }
        }
         for(int i=0;i<s2.length;i++)
        {
            for(int j=0;j<s2.length-1;j++)
            {
                if(s2[j]>s2[j+1])
                {
                    char temp = s2[j];
                    s2[j]=s2[j+1];
                    s2[j+1]=temp;
                }
            }
        }
        for(int i=0;i<s1.length;i++)
        {
            if(s1[i]!=s2[i])
            {
                return false;
            }
        }
        return true;
    }
}
