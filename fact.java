import java.util.*;
public class fact {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no");
        int n = sc.nextInt();

        int f = 1;

        for(int i = 1; i<=n; i++){
           f = f*i;
        }

        System.out.print(f);
    } 
}
