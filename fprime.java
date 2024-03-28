public class fprime {
     public static boolean isprime(int n){
         //corner case 
         if(n==2){
            return true;
         }

        for(int i=2; i<=n-2; i++){
            if(n%i==0){   //completely divide 
                return false;
            }
        }
        return true;
     }
     public static void main(String args[]){
        System.out.println(isprime(2));
     }

    
}
