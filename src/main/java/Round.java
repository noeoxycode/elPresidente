import java.util.Random;
import java.util.Scanner;

public class Round {
    public static void Tour(GameState currentState){
        boolean k = false;
        //while(k == false){
            int j;
            GameState state = new GameState();
            int i = 1;
            float moyenne = 0;
            boolean res = false;
            Event season = new Event("test",Season.Spring);
            Random r = new Random();
            //Choisi un évenement aléatoire en fonction de la saison
            while(res!=true){
                i = r.nextInt(ChoiceScenario.tab.getScenarioEventList().size());
                res = season.checkSeason(ChoiceScenario.tab.getScenarioEventList().get(i).getSeason());
            }
            //affiche l'évenement choisi ci-dessus
            System.out.println("Event: "+ ChoiceScenario.tab.getScenarioEventList().get(i));
            //affiche les propositions possible
            System.out.println("1 for "+ChoiceScenario.tab.getScenarioEventList().get(i).getPropositions().get(0));
            System.out.println("2 for "+ChoiceScenario.tab.getScenarioEventList().get(i).getPropositions().get(1));
            //récupère la proposition choisi
            Scanner scan = new Scanner(System.in);
            j = scan.nextInt();
            //affecte les variables en fonction de la proposition choisi
            Proposition p = new Proposition("test");
            currentState = p.apply(currentState,ChoiceScenario.tab.getScenarioEventList().get(i).getPropositions().get(j-1));
            state = currentState;
            //calcule et affiche la moyenne de satisfaction des factions
            moyenne = ((state.capitalistes + state.communistes + state.ecologistes + state.liberaux + state.loyalistes + state.militaristes + state.nationalistes + state.religieux)/8);
            System.out.println(moyenne);
            //affiche le score
            currentState.score ++;
            System.out.println("Your score is " + currentState.getScore());
           // k = CheckEndGame(moyenne);
        //}
        //appelle end Game
    }
}