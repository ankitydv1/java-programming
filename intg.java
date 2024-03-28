import java.util.*;
public class intg {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      int number;
      int evenSum = 0;
      int oddSum = 0;
      int choice;

      do {
        System.out.print("enter the no");
        number = sc.nextInt();

        if(number%2 == 0){
            evenSum += number;
        }else{
            oddSum += number;
        }
        System.out.print("Do you wnat to continue? press 1 to continue or press 0 to stop");
        choice = sc.nextInt();

      }while(choice == 1);

      System.out.println("the sum of even no :" + evenSum);
      System.out.println("the sum of odd no :" + oddSum);

    } 
}          
    
    
