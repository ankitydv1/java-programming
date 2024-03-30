import java.util.*;
public class func {
    public static void printHello(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        return;
    }

    //sum
    public static void calculateSum(int num1, int num2){ // formal parameters or parameters
        int sum = num1 + num2;
        System.out.println("the sum is " + sum);
    }  

    //swap
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " +b);
        System.out.println("b = " +a);
    }

    //product
    public static void multiply(int num1, int num2){
         int prod = num1*num2;
         System.out.println("the product is = " +prod);
    }

    //factorial
    public static int factorial(int n){
        int f = 1;
        for(int i = 0; i <= n; i++){
            f = f * i;
        }
        return f; //factorial of n
    }

     // binomial coefficient 

    public static int binCoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = (fact_n / fact_r * fact_nmr);
        return binCoeff;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a,b); // arguments or actual parameters

        //product of two no
        multiply(4,5);

        //swap call
        swap(10,12);

        //factorial
        System.out.println(factorial(4));

        System.out.println(binCoeff(2,8));

    }
}
