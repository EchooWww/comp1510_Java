package Srting1;
public class StringClass {
    public static void main (String[] args) {
        long m = 3;
        float n = m;
        System.out.println(n);
        String s = "Hello World";
        System.out.println("Length" + s.length());
        System.out.println("The fifth character: "+ s.charAt(4));
        System.out.println("The fifth character(substring): " + s. substring(4,5));
        System.out.println("The fifth character(substring): " + s. substring(4,8));
        //include the beginning index, don't include the ending index
        System.out.println("The last character(substring): " + s. substring(10,11));
        System.out.println("The last character(substring): " + s.charAt(s.length()-1));
        //use a function(length) inside a function(charAt)
        System.out.println("The fifth character(substring): " + s. substring(11,11));
        System.out.println("The index of l is: " + s.indexOf('l'));
        //index for the first l
        System.out.println("The last index of l is: " + s.lastIndexOf('l'));
        System.out.println("The last index of l is: " + s.indexOf("Wor"));
        //index for the first character
        System.out.println("The last index of l is: " + s.lastIndexOf("Wor"));
        //still 6
        System.out.println("The last index of l is: " + s.indexOf('a'));
        //negative 1
        System.out.println("To check whether the string starts with He: " + s.startsWith("He"));
        System.out.println("To check whether the string contains llo: " + s.contains("llo"));
        //boolean outputs
        int a=20;
        int b=30;
        System.out.println(a == b);
        //compare numbers
        String s1 = "Hello World";
        String s2 = "Welcome";
        System.out.println(s1.equals(s2));
        //compare strings. use "equals" function to compare the value instead of the locations
        
    }
}
