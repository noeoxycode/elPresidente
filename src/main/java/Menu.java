import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
    private static ArrayList<Scenario> scenarios = ScenarioCreator.create();
    public static void debut(){
        int i = 0;
        System.out.println("Welcome in El Presidente\nPlease choose a game mode:\n");
        System.out.println("1 for sandbox mode");
        System.out.println("2 for scenario mode\n");
        //récupère la valeur que le joueur à écrit dans la console
        Scanner scan = new Scanner(System.in);
        i = scan.nextInt();
        switch (i) {
            //Le joueur à choisi le mode sandbox
            case 1:
                System.out.println("You chose the sandbox mode\n");
                ChoiceScenario.tab = scenarios.get(0);
                Difficulty.ChoiceDifficulty();
                break;
            //Le joueur à choisi le mode scénario
            case 2:
                ChoiceScenario.ChoiceScenario();
                break;
            default:
                System.out.println("please choose a number between 1 and 2\n");
                break;
        }

    }
}
