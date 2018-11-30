//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Nara Coldwater 
//Date - Nov 29, 2018 
            
import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
    private char playChoice;
    private char compChoice;
    private Scanner keyboard;
   
    public RockPaperScissors()
    {
      keyboard = new Scanner(System.in); 
    }
    public void playGame()
    {
       System.out.println("choose your weapon [R,P,S]:: ");
       String temp = keyboard.nextLine();
       playChoice = Character.toUpperCase(temp.charAt(0));
       System.out.println("I see...");
       System.out.println("you chose:: " + playChoice);
       setComp();
       System.out.println("The computer chose:: " + compChoice);
       System.out.println("");
       getWinner();
    }
    public char getPlayer()
    {
     return playChoice;
    }     
    public char getComp()
    {
     return compChoice;
    }           
    public void setPlayer(char pChoice)
    {
      playChoice = pChoice;
    }
    public void setComp()
    {
      int range = 3;
      int rand = (int)(Math.random() * range); 
      char array[] = {'R','P','S'};
      
      compChoice = array[rand];
      
    }
    public void getWinner()
     {
       if(compChoice == 'R')
       {
          if(playChoice == 'R')
           {
             System.out.println("It's a tie! play again?");
           } 
           else if(playChoice == 'P')
           {
             System.out.println("Paper beats Rock. You win!");
           }
           else if(playChoice == 'S')
           {
             System.out.println("Rock beats Scissors. You lose :(");
           }
           else 
           {
             System.out.println("No cheating! Choose between Rock, Paper, and Scissors");
           }
       } 
       else if(compChoice == 'P')
       {
           if(playChoice == 'R')
           {
             System.out.println("Paper beats Rock. You lose :(");
           } 
           else if(playChoice == 'P')
           {
             System.out.println("It's a tie! play again?");
           }
           else if(playChoice == 'S')
           {
             System.out.println("Scissors beat Paper. You win!");
           }
           else 
           {
             System.out.println("No cheating! Choose between Rock, Paper, and Scissors");
           }
       }
       else if(compChoice == 'S')
       {
           if(playChoice == 'R')
           {
             System.out.println("Rock beats Scissors. You win!");
           } 
           else if(playChoice == 'P')
           {
             System.out.println("Scissors beat Paper. You lose :(");
           }
           else if(playChoice == 'S')
           {
             System.out.println("It's a tie! play again?");
           }
           else 
           {
             System.out.println("No cheating! Choose between Rock, Paper, and Scissors");
           }
       }
    }
}
  
