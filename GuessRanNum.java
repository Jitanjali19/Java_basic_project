import java.util.Scanner;

public class GuessRanNum {
   
        public static void main(String[] args) {
           
           Scanner sc = new Scanner(System.in);
         int myNumber = (int)(Math.random()*100);
         int userNumber=0;
           do{
    System.out.println("GUESS MY NUMBER(1-100:");
             userNumber=sc.nextInt();
             
             if(userNumber==myNumber){
    System.out.println("WOHoooooo...CORRECT ANS");
             }else if(userNumber>myNumber){
      System.out.println("your number is too long");    
             }else{
     System.out.println("your number is too small"); }
             
           }while(userNumber>=0);
           
     System.out.println("myNumber was:");
     System.out.println(myNumber);
        }
    }

