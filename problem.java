import java.util.*;
public class problem {
    public static int average(int a, int b, int c){
        int avg = (a+b+c)/3;
        return (avg);
    } 
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static boolean isPalindrome(int n){
        int palindrome = n;
        int reverse = 0;  
        
        while(palindrome != 0){
            int rem = n%10;
            reverse = reverse * 10 + rem;
            n = n/10;
        }
        if(n==reverse){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        // System.out.println("the average is = " + average(2,4,3));
        // System.out.println(isEven(3));
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();

        if(isPalindrome(palindrome)){
            System.out.println("number :"+palindrome+"is a palindrome");
        }
        else{
            System.out.println("number : " + palindrome + "is not a palindrome");
        }
    }
}
