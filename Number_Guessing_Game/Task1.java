//Task1
//Number Guessing Game

import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String args[]) {
        generaterandom();
    }


    public static void generaterandom(){
        Random rand = new Random();
        int randomnumber = rand.nextInt(1000) + 1;
        System.out.println(" ");
        System.out.println("Random number: " + randomnumber);

        System.out.println("Enter Your number(1-1000):");
        Scanner n = new Scanner(System.in);
        int count = 0;
       while(true){
        int Playerguess = n.nextInt();
        count++; 
            if (Playerguess == randomnumber) {
                System.out.println("Correct! You Win");
                System.out.println("It took you "+count+" tries");
             break;
            } 
            else if (Playerguess > randomnumber) {
                System.out.println("Nope! The number is Lower,Guess Again.");
            } else {
                System.out.println("Nope! The number is Higher,Guess Again.");
            }
            
        }

        System.out.println("Press 1 to play again");
        System.out.println("Press 0 to exit");
        int choice=n.nextInt();
        if(choice==1){
            generaterandom();
        }
        else{
            return ;
        }
       
        n.close();
    }
}
