public class fr {
    public int reverse(int x) {
        int rev = 0;
        while(x>0){
             int lastdigit = x % 10;
            rev = (rev*10) + lastdigit;
            x++;
            x = x/10;
        }
        return rev;
    }
    public static void main(String args[]){
       System.out.print(reverse(108));
    }
}


