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
    
   int run=1;
    do{ 
         
        System.out.println("do you want to play Rock,Paper,scissors");
    
        ans=keyedInput.next();
        
    switch (ans){
        case ("yes"):case("Yes"):
            System.out.println("Yaaaa!");
            break;
        case ("no"):case("No"):
            System.out.println("ok");
            System.out.println("I will leave you alone now");
            System.out.println("By");
            run=2;
            break;
        default: 
            System.out.println("you enterd IncORecLy CossinG A ErRor to ocCur");
            System.out.println("shuting down now");
            run=2;
            break;
    }

        System.out.println("ok the rules are simple ");
        System.out.println("don't try to be sneeky and do something you are not suposed to(that means you Mr.Kaune) ");
        System.out.println("just enter your answer and make sure that you spell it right");
        System.out.println("and have fun");
       
        
        
        Normal();
        
    }while(run>=1);
    }
    
   public static void Normal(){
      Scanner keyedInput = new Scanner (System.in);
      
      String ans;
      
      int run2 = 1;
      do{
      System.out.println("please enter either rock,paper or scissors");
      ans=keyedInput.next();
      
      int opponent,rock,paper,scissors,ans2;
      
      
      switch (ans){
          case("rock"):case("Rock"):
          opponent=(int)(Math.random()*3+1-1);
          ans2=1;  
         if(ans2==opponent){
             System.out.println("you tied");
         }
          if(ans2<=opponent){
             System.out.println("you lost");
         }
          if(ans2>=opponent){
             System.out.println("you won");
         }
          
         break;
         case("paper"):case("Paper"):
             ans2=2;
             opponent=(int)(Math.random()*3+1-1);
             if(ans2==opponent){
             System.out.println("you tied");
         }
          if(ans2<=opponent){
             System.out.println("you lost");
         }
          if(ans2>=opponent){
             System.out.println("you won");
         }
               
             break;
        case("scissors"):case("Scissors"):
             ans2=3;
             opponent=(int)(Math.random()*3+1-1);
            if(ans2==opponent){
             System.out.println("you tied");
         }
          if(ans2<=opponent){
             System.out.println("you lost");
         }
          if(ans2>=opponent){
             System.out.println("you won");
         }
             break;
               default: 
            System.out.println("you enterd IncORecLy CossinG A ErRor to ocCur");
            System.out.println("shuting down now");
            run2++;
            break;
      }
      }while(run2>=1);
    }
     
}


