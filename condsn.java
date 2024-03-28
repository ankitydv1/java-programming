import java.util.*;
public class condsn {
   public static void main(String args[]) {
    int age =7;
     if(age >= 18){         //if first condition is true then no other condition will b checked
        System.out.println("adult : drive,vote");
    }
    else if(age<18 && age>13 ){
        System.out.println("teenager");
    }
    else{
        System.out.println("not adult");
    }


    // if(age >= 18){ // here all the condition will be checked 
    //     System.out.println("adult : drive,vote");
    // }
    // if(age<18 && age>13 ){
    //     System.out.println("teenager");
    // }
    // else{
    //     System.out.println("not adult");
    // }
    }
   }

