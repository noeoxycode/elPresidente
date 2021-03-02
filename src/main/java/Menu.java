import java.util.ArrayList;
import java.util.Scanner;

// classe menu qui permet de choisir le mode de jeu
public class Menu {
    static ChoiceScenario choice;
    public int difficulty;
// debut du programme

    public void setDifficulty(int difficulty) {this.difficulty = difficulty;}

    public static void main(String[] args) {

        int i = 0;
        System.out.println("Welcome in El Presidente\n");
        System.out.println("Please choose a game mode:\n");
        System.out.println("1 for sandbox mode");
        System.out.println("2 for scenario mode\n");
        //récupère la valeur que le joueur à écrit dans la console
        Scanner scan = new Scanner(System.in);
        i = scan.nextInt();
        switch (i) {
            //Le joueur à choisi le mode sandbox
            case 1:
                System.out.println("You chose the sandbox mode\n");
                //game set up
                break;
            //Le joueur à choisi le mode scénario
            case 2:
                choice.ChoiceScenario();
                break;
            default:
                System.out.println("please choose a number between 1 and 2\n");
                break;
        }
        System.out.println("Veuillez choisir la difficulté : 1 pour facile, 2 pour  moyen, 3 pour difficile");
        i = scan.nextInt();
        GameState currentGameState = new GameState();
        currentGameState.setDifficulty(i);


    }
}


