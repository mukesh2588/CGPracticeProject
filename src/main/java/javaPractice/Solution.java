package javaPractice;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int i = 0; 
        do {
            i++; 
            if(sc.hasNext()) {
                // Assign the message value to be passed from user input
                String str = sc.nextLine();
                System.out.println(i + " " + str);
            }    
        } while(sc.hasNextLine());
        
        sc.close();
    }
}