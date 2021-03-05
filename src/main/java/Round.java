import java.util.Random;
import java.util.Scanner;

public class Round {
    public static void Tour(GameState currentState){
            boolean echec = false;
            int j;
            int s = 0;
            GameState state = new GameState();
            int i = 1;
            float moyenne = 0;
            boolean res = false;
            Season test = Season.Spring;
            while(!echec){
            Event season = new Event("test",test);
            Random r = new Random();
            //Choisi un évenement aléatoire en fonction de la saison
            while(!res){
                i = r.nextInt(ChoiceScenario.tab.getScenarioEventList().size());
                res = season.checkSeason(ChoiceScenario.tab.getScenarioEventList().get(i).getSeason());
            }
            res=false;
            //affiche l'évenement choisi ci-dessus
            System.out.println("Event: "+ ChoiceScenario.tab.getScenarioEventList().get(i));
            //affiche les propositions possible
            System.out.println("1 for "+ChoiceScenario.tab.getScenarioEventList().get(i).getPropositions().get(0));
            System.out.println("2 for "+ChoiceScenario.tab.getScenarioEventList().get(i).getPropositions().get(1));
            //récupère la proposition choisi
            Scanner scan = new Scanner(System.in);
            j = scan.nextInt();
            if (j > 2 || j < 1){
                while (j > 2)
                {
                    System.out.println("Error, please choose between 1 and 2");
                    j = scan.nextInt();
                }
            }

            //affecte les variables en fonction de la proposition choisi
            Proposition p = new Proposition(" ");
            currentState = p.apply(currentState,ChoiceScenario.tab.getScenarioEventList().get(i).getPropositions().get(j-1));
            state = currentState;
            //calcule et affiche la moyenne de satisfaction des factions
            moyenne = ((state.capitalistes + state.communistes + state.ecologistes + state.liberaux + state.loyalistes + state.militaristes + state.nationalistes + state.religieux)/8);
            System.out.println("Your  average this round is : "  + moyenne);
            //affiche le score
            currentState.score ++;
            System.out.println("Your score is " + currentState.getScore());
            System.out.println("\n");
             //change la saison
        s++;
        if(s==1){
            test = Season.Summer;
        }else if (s==2){
            test = Season.Fall;
        }else if (s==3){
            test = Season.Winter;
        }else if (s==4){
            s = 0;
            test = Season.Spring;
        }
        EndGame check = new EndGame();
        check.endGame(moyenne, currentState.difficulty, currentState.score);
        }

    }
}