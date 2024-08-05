package project;
import java.util.Random;
import java.util.Scanner;

public class GameRSP{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Random random=new Random();

    String rps[]={"Rock","Paper","Scissors"};
    String computerMove,playerMove;

    while(true){
System.out.println("Enter move (Rock,Paper,Scisssors). To exit game , type \"exit\" ");

playerMove=sc.nextLine();

if(playerMove.equalsIgnoreCase("exit")){
  break;
}

if(!playerMove.equalsIgnoreCase("Rock") && !playerMove.equalsIgnoreCase("paper") && !playerMove.equalsIgnoreCase("scissors")){
  System.out.println("Invalid move,please try again!!!");
  continue;
}
int computerChoice=random.nextInt(3);
computerMove=rps[computerChoice];
System.out.println("Computer move:"+computerMove);

if(playerMove.equalsIgnoreCase(computerMove)){
  System.out.println("Its a tie!");
}else if(playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper") || playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock") || playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")  ){
  System.out.println("You win!");
  break;
}else{
  System.out.println("You lose!");
}
    }

 sc.close();

  }
}

