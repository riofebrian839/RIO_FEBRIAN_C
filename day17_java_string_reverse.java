import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        boolean isPalindrom = true;
        for(int i=0;i<s.length();i++){
            if(!s.substring(i,i+1).equals(s.substring(s.length()-1-i, s.length()-i))){
                isPalindrom = false;
                break;
            }
        }
        if(isPalindrom){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

