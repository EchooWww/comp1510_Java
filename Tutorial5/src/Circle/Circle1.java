package Circle;

import java.util.ArrayList;
import java.util.List;

public class Circle1 {
    public static void main (String[] args) {
        List <Integer> arr = new ArrayList<Integer>();


        System.out.println(arr);  
        
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, arr.get(i) + 1); // this only changes the loop variable, not the actual array element
        }

        System.out.println(arr);  

        }
}

