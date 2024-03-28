import java.util.*;
public class re {
    public static void main(String args[]){
     int n = 21122005;

     while(n>0){
        int lastDigit = n%10;
        System.out.print(lastDigit);
        n = n / 10;
     }
     System.out.println();
    }   
}
