import java.util.Scanner;
import java.util.ArrayList;

public class ChoiceScenario {
    public static Scenario tab;
    private static ArrayList<Scenario> scenarios = ScenarioCreator.create();
    //fonction qui permet de choisir le scénario
    public static void ChoiceScenario() {
        int i = 0;
        //affiche tout les scénarios
        System.out.println("You chose the scenario mode.\n");
        System.out.println("Now choose a Scenario:");
        //affiche la liste des scénario
        for(int index = 1; index < scenarios.size(); index++){
            System.out.println(index+" for "+scenarios.get(index).getTitle());
        }
        //récupère la valeur que le joueur à écrit dans la console
        Scanner scan2 = new Scanner(System.in);
        i = scan2.nextInt();
        //récupère le titre du scénario choisi par le joueur
        tab = scenarios.get(i);
        System.out.println("\nYou chose the scenario "+tab+".");
        // appelle difficulty
        Difficulty.ChoiceDifficulty();
    }

}