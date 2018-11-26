/*
 *Karl Butler
 *for Mr.Kaune
 *11/22/2018
 */
package caluminatigunit;
import java.util.Scanner;
/**
 *
 * @author Karl
 */
public class CaluminatigUnit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner keyedInput = new Scanner (System.in);
    
    String ans;
    
   
    
         //asking do you want to play rock paper scissors
        System.out.println("do you want to play Rock,Paper,scissors");
    
        ans=keyedInput.next();
        
    switch (ans){
        case ("yes"):case("Yes"):
            System.out.println("Yaaaa!");
            break;
        case ("no"):case("No"):
            System.out.println("well actuly you have no choice");
            
            break;
        default: 
            System.out.println("you enterd incorectly I will assume that you ment yes ");
            break;
    }

        System.out.println("ok the rules are simple ");
        System.out.println("don't try to be sneeky and do something you are not suposed to(that means you Mr.Kaune) ");
        System.out.println("just enter your answer and make sure that you spell it right");
        System.out.println("and have fun");
  
        Play();
        
    
    }
    /**
     * this does the playing of rock paper scissors
     */
   public static void Play(){
      Scanner keyedInput = new Scanner (System.in);
       
      String ans;
      
      int run2 = 1;
      
      do{
          
          System.out.println("please enter rock,Paper or scissors");
      ans=keyedInput.next();
      int opponent,rock,paper,scissors,ans2;
      
      opponent=(int)(Math.random()*3+1);
      
      switch (ans){
          case("rock"):case("Rock"):
          
          ans2=1;  
         if(ans2==opponent){
             System.out.println("you tied");
         }
          if(ans2<opponent){
             System.out.println("you lost");
         }
          if(ans2>opponent){
             System.out.println("you won");
             
         }
          
         break;
         case("paper"):case("Paper"):
             ans2=2;
             
             if(ans2==opponent){
             System.out.println("you tied");
         }
          if(ans2<opponent){
             System.out.println("you lost");
         }
          if(ans2>opponent){
             System.out.println("you won");
         }
               
             break;
        case("scissors"):case("Scissors"):
             ans2=3;
            if(ans2==opponent){
             System.out.println("you tied");
         }
          if(ans2<opponent){
             System.out.println("you lost");
         }
          if(ans2>opponent){
             System.out.println("you won");
         }
             break;
               default: 
            System.out.println("you enterd IncORecLy CossinG A ErRor to ocCur");
            System.out.println("shutting down now");
            run2++;
            break;
      }      
          System.out.println("do you want to play again");
          ans=keyedInput.next();
          switch(ans){
              case("yes"):case("Yes"):
                  break;
              case("no"):case("No"):
                  System.out.println("ok");
                  run2++;
                  break;
          }
      }while(run2!=2);
      }
    }
     
        


