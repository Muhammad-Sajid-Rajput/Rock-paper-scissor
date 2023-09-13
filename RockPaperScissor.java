import java.util.*;
public class RockPaperScissor{
    public static void main(String[] args) {
        System.out.println("Rock Paper Scissor game");
        Scanner input =new Scanner(System.in);
        Random random= new Random();
            String[] choices={"rock" , "paper" , "scissor"};

        int  userchoice,computerchoice,result;
        int userwins=0;
        int computerwins=0;
        int ties=0;

        for (int round =1;round <=5;round++){
            System.out.println("enter your choice :");
            System.out.println("0 =Rock ");
            System.out.println("1 =paper ");
            System.out.println("2 =scissor ");
            do{
            userchoice=input.nextInt();
            }
            while (userchoice<0 || userchoice >2);

            computerchoice=random.nextInt(3);
            System.out.println("your choise :\t"+choices[userchoice]);
            System.out.println("computer choise :\t"+choices[computerchoice]);
            result=(userchoice-computerchoice+3)%3;

            if(result==0){
                System.out.println("its a tie :");
                ties++;
            }
            else if(result==1){
                System.out.println("you wins :");
                userwins++;
            }
            else{
                System.out.println("computer wins :");
                computerwins++;
            }
        }
        System.out.println();
        System.out.println("\t\t\tfinal result");
        System.out.println("you wins "+ userwins+" times:");
        System.out.println("computer wins "+ computerwins+" times:");
        System.out.println("ties "+ ties);
        if (userwins>computerwins){
            System.out.println("congrats you win");
        }else if(userwins<computerwins){
            System.out.println("you lose :(");
        }
        else {
            System.out.println("its a tie!");
        }
        System.out.println("thanks for playing this game !");
        input.close();
    }
}