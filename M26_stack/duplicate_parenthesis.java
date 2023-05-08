import java.util.*;
public class duplicate_parenthesis 
{
    public static boolean isDuplicateParenthesis(String str)
    {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            // closing
            int count = 0;
            if(ch == ')')
            {
                while(!s.isEmpty() && s.peek() != '(')
                {
                    s.pop();
                    count++;
                }
                if(count < 1)
                {
                    return true;
                }
                else
                {
                    s.pop();
                }
            }
            else  // opening
            {
                s.push(ch);
            }
        }
        return false;
    }
     public static void main(String[] args) {
        String str = "(a+b)";
        String str2 = "((a+b))";
        System.out.println(isDuplicateParenthesis(str));
        System.out.println(isDuplicateParenthesis(str2));
     }    
}
