import java.util.Scanner;
public class Difficulty {
    public static void ChoiceDifficulty(){
        int i = 0;
        System.out.println("Please choose the difficulty:\n1 for easy\n2 for medium\n3 for difficult");
        Scanner scan = new Scanner(System.in);
        i = scan.nextInt();
        GameState currentGameState = new GameState();
        currentGameState.setDifficulty(i);
        Round.Tour(currentGameState);
    }
}
