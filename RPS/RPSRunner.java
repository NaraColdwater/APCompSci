//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Nara Coldwater
//Date - Nov 29, 2018

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
     public static void main(String args[])
    {  
      RockPaperScissors game = new RockPaperScissors();

      System.out.println("Let's play rock, paper, scissors!");
      do 
      { 
        game.playGame();
        System.out.println("");
        game.getComp();
        game.getPlayer();
      }   
      while(true);
    }
}


