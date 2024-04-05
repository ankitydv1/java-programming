package array;
import java.util.*;
public class arraylinsrch {
    public static int linearSearch(int numbers[],int key){

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }else{
                return -1;
            }
        }
    }
    public static void main(String args[]){
        int numbers[] = {1,2,4,13,56,7,9,14};
        int key = 56;
 
        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("key is at index :"+ index);
        }
    }
}
    

