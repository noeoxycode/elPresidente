import java.util.Scanner;
import java.util.ArrayList;

public class ChoiceScenario {
    public static Scenario tab = new Scenario();
    static scenarioCreator list;
    //fonction qui permet de choisir le scénario
    public static void ChoiceScenario() {
        int i = 0;
        int j = 1;
        int length;
        //affiche tout les scénarios
        System.out.println("You chose the scenario mode.\n");
        System.out.println("Now choose a scenario:");
        //Initialise le tableau test avec tout les scénario possible
        scenarioCreator test = new scenarioCreator();
        //enlève le sandbox de la liste des scénario
        list.scenarioList.remove(0);
        //affiche la liste des scénario
        for(Scenario ent : list.scenarioList){
            System.out.println(j+" for "+ent);
            j++;
        }
        //récupère la valeur que le joueur à écrit dans la console
        Scanner scan2 = new Scanner(System.in);
        i = scan2.nextInt();
        //récupère le titre du scénario choisi par le joueur
        tab = list.scenarioList.get(i-1);
        // game set up
    }
}
