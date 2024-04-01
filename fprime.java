public class fprime {

    // only for n>=2
    // public static boolean isPrime(int n){
    //     // corner cases
    //     //2
    //     if(n==2){
    //         return true;
    //     }
    //     for(int i=2; i<=n-1; i++){
    //        if(n%i == 0){
    //          return false;
    //        }
    //     }
    //     return true;
    // }

    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    //primes in range 

    public static void primesInrange(int n){
        for(int i=1; i<=n; i++){
            if(isPrime(i) == true){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }

    // binary to decimal

    public static void binToDec(int binNum){
        int pow = 0;
        int decNum = 0;

        while(binNum>0){
            int lastDigit = binNum%10;
            decNum = (decNum + (lastDigit*(int)Math.pow(2,pow)));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("The decimal of " + binNum +" = " +decNum);
    }

    public static void decToBin(int n){
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while(n>0){
            int rem = n%2;
            binNum = binNum + (rem*(int)Math.pow(10,pow));
            pow++;
            n = n/2;
        }
        System.out.println("The binary number of " + myNum +" = " +binNum);
    }
  
     public static void main(String args[]){
        System.out.println(isPrime(3));
        primesInrange(152);
        binToDec(101);
        decToBin(23);
     }  
}
