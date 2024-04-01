public class bin {
    public static int factorial(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f*i;
        }
        return f;
    }

    public static int binCoeff(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);
        int binCoeff = n_fact/(r_fact*nmr_fact);
        return(binCoeff);
    }
//function overloading using parameter 

    // fun to calc sum of two num
    public static int sum(int a, int b){
        int sum = a+b;
        return(sum);
    }

    // func to calculate sum of three no
    public static int sum(int a, int b, int c){
        int sum = a+b+c;
        return(sum);
    }

// function overloading using datatypes 
    
    //func to calc int sum
    public static int summ(int a, int b){
        return(a+b);
    }

    //func to calc float sum
    public static float summ(float a, float b){
        return(a+b);
    }

    public static void main (String args[]){
       System.out.println("binCoeff is = " + binCoeff(8,4));
       System.out.println(sum(2,34,4));
       System.out.println(sum(2,4));

       System.out.println(summ(2,3));
       System.out.println(summ(2.3f,3.4f));
    }   
}
