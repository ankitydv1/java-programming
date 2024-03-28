import java.util.*;
public class wer {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 2){
            System.out.print("the n is prime no");
        }else{
            Boolean isPrime = true;
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.print("n is prime number");
            }else{
                System.out.print("n is not prime number");
            }
        }    
    }
}
