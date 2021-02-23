import java.util.Random;
public class Round {
    private static ChoiceScenario res;
    public static void Tour(){
        //Choisi un évenement aléatoire
        Random r = new Random();
        int i = r.nextInt(res.tab.getScenarioEventList().size());
        //affiche l'évenement choisi ci-dessus
        System.out.println("Event: "+ res.tab.getScenarioEventList().get(i));
        //affiche les propositions possible

    }
}
