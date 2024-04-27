import java.util.*;
public class arrayBinarySearch {
    public static int binarySearch(int numbers[], int key){
         int start = 0, end = numbers.length-1;

         while(start <= end){
            int mid = (start+end)/2;

            //comparisons
            if(numbers[mid] == key) {
                return mid;
            }
            if(numbers[mid] < key){ //right
                start = mid+1;
            }else{
                end = mid-1;
            }
         }
         return -1;
    }

    public static void main(String args[]){
        int numbers[] = {2,4,5,8,9,10,12,13};
        int key = 10;
        System.out.println("index for key is : " + binarySearch(numbers, key));
    }
}
