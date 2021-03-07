import java.util.Scanner;

public class EndGame {
    public void endGame(float moyenne, int difficulty, int score)
    {
        Boolean check = CheckEndGame(moyenne, difficulty);
        if (check)
        {
            System.out.println("Game over ! Your score is : "+ String.valueOf(score));
            System.out.println("Would you like to play again ?");
            System.out.println("1 = yes   2 = no");
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            if (i == 1)
            {

                Menu.debut();
            }

            else if (i == 2)
            {
                System.out.println("Thanks for playing, see you soon ! Bye !");
                System.exit(0);
            }
            else
            {
                System.out.println("Error, please try again");
                endGame(moyenne,difficulty, score);
            }
        }

    }

    public Boolean CheckEndGame (float moyenne, int difficulty)
    {
        if ((moyenne <=10 && difficulty == 1)||(moyenne <= 20 && difficulty == 2)||(moyenne <= 30 && difficulty == 3))
            return true;
        else
            return false;

    }
}
