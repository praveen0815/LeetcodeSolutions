class Solution {
    public int numberOfSpecialChars(String word) 
    {
        int lc = 0;
        int uc = 0;

        for(char ch : word.toCharArray())
        {
            if(ch >= 'a' && ch <= 'z')
            {
                lc |= ( 1 << (ch - 'a'));
            }
            else
            {
                uc |= (1 << (ch - 'A'));
            }
        }
        int res = 0;

        for(int i = 0; i < 26; i++)
        {
            if ((lc & (1 << i)) != 0 && 
            (uc & ( 1 << i)) != 0)
            {
                res++;
            }
        }
        return res;  
    }
}