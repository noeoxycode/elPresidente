import java.util.Scanner;
public class Difficulty {
    public static void ChoiceDifficulty(){
        int i = 0;
        System.out.println("Please choose the difficulty: 1 for easy, 2 for medium, 3 for difficult");
        Scanner scan = new Scanner(System.in);
        i = scan.nextInt();
        GameState currentGameState = new GameState();
        currentGameState.setDifficulty(i);
        Round.Tour(currentGameState);
    }
}
