import java.util.Random;
import java.util.Scanner;

public class Round {
    public static void Tour(GameState currentState){
        int j;
        //Choisi un évenement aléatoire
        Random r = new Random();
        int i = r.nextInt(ChoiceScenario.tab.getScenarioEventList().size());
        //affiche l'évenement choisi ci-dessus
        System.out.println("Event: "+ ChoiceScenario.tab.getScenarioEventList().get(i));
        Event test = ChoiceScenario.tab.getScenarioEventList().get(i);
        //affiche les propositions possible
        System.out.println("1 for "+ChoiceScenario.tab.getScenarioEventList().get(i).getPropositions().get(0));
        System.out.println("2 for "+ChoiceScenario.tab.getScenarioEventList().get(i).getPropositions().get(1));
        //récupère la proposition choisi
        Scanner scan = new Scanner(System.in);
        j = scan.nextInt();
        //affecte les variables en fonction de la proposition choisi
        Proposition p = new Proposition("test");

        p.apply(currentState,ChoiceScenario.tab.getScenarioEventList().get(i).getPropositions().get(j-1));


        GameState state = new GameState();
        System.out.println(state.capitalistes);


    }
}