package q1;

public class delivedriod {
    public static void main(String[] args) {
        String P = "!!!===????";
        int i = 1;
        int count;
        while (i< P.length()) {
            count = 1;
            while (i< P.length() && P.charAt(i) == P.charAt(i-1)) {
                count++;
                i++;
           }
        System.out.print(count + "" + P.charAt(i-1));
        i++; }
    }
}
