public class String_charAt {
    public static void printLetters(String str){
            for(int i=0;i<str.length();i++)
            {
                System.out.print(str.charAt(i)+" ");
            }
            System.out.println();
    }

    public static void main(String[] args) {
        String firstName="Ankit";
        String lastName="Kumar";
        String fullName=firstName+" "+lastName;
        System.out.println(fullName);
        System.out.println(fullName.charAt(2));
        printLetters(fullName);
    }
    
}
