public class pattern {
    public static void hollow_rectangle(int toRows, int toCols){
        //outer loops
        for(int i=1; i<=toRows; i++){
            //inner columns 
            for(int j=1; j<=toCols; j++){
                //cell i,j
                if(i==1||i==toRows||j==1||j==toCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //inverted half pyramid
    public static void inverted(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");   
            }
             //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // inverted half pyramid numbers
    public static void invertedNum(int n){
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //floyd triangle
    public static void floyd_triangle(int n){
        int counter = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    //0 1 triangle
    public static void zeroOnetriangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollow_rectangle(10,12);
        inverted(4);
        invertedNum(7);
        floyd_triangle(5);
        zeroOnetriangle(5);
    }
    
}
