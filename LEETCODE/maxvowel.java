package LEETCODE;
class maxvowel 
{
    public static int maxVowels(String s, int k) 
    {
        int maxvowel = 0;
        for(int i = 0 ; i<s.length();i++)
        {
            int count = 0;
            int j = i;
            char ch = s.charAt(j);
            while(j<i+k)
            {
                if(ch.charAt(j) == 'a' || ch.charAt(j)== 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    count++;
                    j++;
                }
            }
            maxvowel = Math.max(count,maxvowel);

        }
        return maxvowel;
    }
    public static void main(String[] args) 
    {
        String str = "leetcode";
        System.out.println(maxVowels(str,3)); 
        
    }
}