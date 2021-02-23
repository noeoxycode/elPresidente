import java.util.Random;
public class Round {
    public static void Tour(){
        //Choisi un évenement aléatoire
        Random r = new Random();
        int i = r.nextInt(ChoiceScenario.tab.getScenarioEventList().size());
        //affiche l'évenement choisi ci-dessus
        System.out.println("Event: "+ ChoiceScenario.tab.getScenarioEventList().get(i));
        //affiche les propositions possible
        System.out.println(ChoiceScenario.tab.getScenarioEventList().get(i).getPropositions());
    }
}