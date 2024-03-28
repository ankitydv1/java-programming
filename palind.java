public class palind {
    public static void main(String args[]){

        int original = 12321;
        int revNum = 0;
        int num = original;


        while(num>0){
            int lastdigit = num%10;
            revNum = revNum*10 + lastdigit;
            num = num/10;
        }

        if(revNum == original ){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
    
}
