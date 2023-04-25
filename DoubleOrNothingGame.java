package anudip;
import java.util.Random;
import java.util.Scanner;

class DoubleOrNothing
{
    private static int startPoints = 10;
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private int current = startPoints;
    private boolean isStillPlaying = true;

    public void playGame()
    {
        printWelcome();
        askUserToContinue();
        
        while(this.isStillPlaying)
        {
            printTryToDouble();

            if(shouldDouble())
            {
                doubleCurrent();
                printCongrats();
                askUserToContinue();
            }else{
                printLost();
                return;
            }
        }
        printWalkawayMessage();
    }
    private void printWelcome()
    {
        System.out.println("Let's play Double or Nothing. We'll start you when you say yes");    
    }
    private void printTryToDouble()
    {
        System.out.println("Let's try to double it!");
    }
    private void printCongrats()
    {
        System.out.println("Congrats! You now have "+this.current+" points");
    }
    private void printLost()
    {
        System.out.println("You've lost. No points for you");
    }
    private void printWalkawayMessage()
    {
        System.out.println("Congrats! You finish with "+this.current+" points. Thank you for playing.");
    }
    private boolean shouldDouble()
    {
        return this.random.nextInt(2) == 0;
    }
    private void doubleCurrent()
    {
        this.current = this.current * 2;
    }
    protected void askUserToContinue()
    {
        System.out.println("Would you like to continue and try to double your winings? Then enter yes");
        this.isStillPlaying = this.scanner.nextLine().toUpperCase().equals("YES");
    }
    protected boolean getIsStillPlaying()
    {
        return this.isStillPlaying;   
    }

}

public class DoubleOrNothingGame
{
    public static void main(String[] args) {
        DoubleOrNothing d1 = new DoubleOrNothing();
        d1.playGame();
    }
}