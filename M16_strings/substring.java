public class substring {
    public static String subString(String str,int si,int ei)
    {
        String substr = "";
        for(int i=si;i<ei;i++)
        {
             substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        // System.out.println(subString(str,0,5));

        // there is direct inbuild method present to find the substring of the string so u have choice whatu want to do whether u want to build ur own method or use readymade method
        System.out.println(str.substring(0,5));
    }
    
}
