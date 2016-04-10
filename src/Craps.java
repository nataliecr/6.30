import java.util.Scanner;

public class Craps {
   public static void main(String[] args){
     int first_roll = roll(), next_roll;
     
     if (first_roll == 2 || first_roll == 3 || first_roll == 12){
       System.out.println("You lose");
       System.exit(0);
     }
     if (first_roll == 7 || first_roll == 11){
       System.out.println("You win");
       System.exit(0);
     }
     else
       System.out.println("Point is " + first_roll);
        
     do{
       next_roll = roll();
     } while (next_roll != 7 && next_roll != first_roll);
     
     if (next_roll == 7)
       System.out.println("You lose");
     else
       System.out.println("You win");
   }   // main
   
   public static int roll(){
     int roll_1 = (int)(1 + Math.random()*6);
     int roll_2 = (int)(1 + Math.random()*6);
     int sum = roll_1 + roll_2;
     System.out.println("You rolled " + roll_1 + " + " + roll_2 + " = " + sum);
     return sum;
   } // roll
}
