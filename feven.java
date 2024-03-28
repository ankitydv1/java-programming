public class feven {
    public static boolean isprime(n){
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
            return false;
            }
        }
        return true;
        public static int primrange(int n){
            for(int i=2; i<=n; i++){
                if(isprime==i){
                    System.out.println(i++);
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        primrange(10);
    }
    
}
