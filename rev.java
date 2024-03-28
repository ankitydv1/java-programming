import java.util.*;
public class rev {
    public static void main(String args[]){
    int n = 4567;

    while( n>0){
        int lastdigit = n%10;
        System.out.print(lastdigit);
        n/=10;
    }
}
    
}
