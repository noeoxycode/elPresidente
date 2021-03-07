import java.util.Random;
import java.util.Scanner;

public class Round {
    public static void Tour(GameState currentState){
            boolean echec = false;
            endOfTheYear End = new endOfTheYear();
            int j;
            int s = 0;
            GameState state = new GameState();
            int i = 1;
            float moyenne = 0;
            boolean res = false;
            Season test = Season.Spring;
            //initialise le pourcentage d'agriculture et d'industrie dans la partie
            while(currentState.agriculturePart + currentState.industrialPart > 100){
                currentState.agriculturePart = new Random().nextInt(100);
                currentState.industrialPart = new Random().nextInt(100);
            }
            //initialise le nbr de nourriture en fonction du pourcentage de l'agriculture
            currentState.nourriture = currentState.agriculturePart*40;
            System.out.println("\nLet the game begin !");
            while(!echec){
            Event season = new Event("test",test);
            Random r = new Random();
            //Choisi un évenement aléatoire en fonction de la saison
            while(!res){
                i = r.nextInt(ChoiceScenario.tab.getScenarioEventList().size());
                res = season.checkSeason(ChoiceScenario.tab.getScenarioEventList().get(i).getSeason());
            }
            res = false;
            //affiche l'évenement choisi ci-dessus
            System.out.println("A new event has just appeared: "+ ChoiceScenario.tab.getScenarioEventList().get(i)+"\n");
            //affiche les propositions possible
            System.out.println("Choose one of these two proposals:");
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
            Proposition p = ChoiceScenario.tab.getScenarioEventList().get(i).getPropositions().get(j-1) ;
            p.apply(currentState);
            state = currentState;
            //calcule et affiche la moyenne de satisfaction des factions
            moyenne = ((state.capitalistes.getPopularity() + state.communistes.getPopularity() + state.ecologistes.getPopularity() + state.liberaux.getPopularity() + state.loyalistes.getPopularity() + state.militaristes.getPopularity() + state.nationalistes.getPopularity() + state.religieux.getPopularity())/8);
            System.out.println("Your  average this round is : " + moyenne);
            //affiche le score
            currentState.score ++;
            System.out.println("Your game score is " + currentState.getScore()+"\n");
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
            //calcule le nombre de nourriture restante à la fin de l'année
            currentState.nourriture = currentState.nourriture - ((currentState.nbCapitalistes+ currentState.nbCommunistes+ currentState.nbEcologistes+ currentState.nbLiberaux+ currentState.nbLoyalistes+ currentState.nbMilitaristes+ currentState.nbNationalistes+ currentState.nbReligieux)*4);
            //augmente l'argent du joueur en fonction de l'industrie
            currentState.money = currentState.money +(currentState.industrialPart*10);
            //appelle endOfTheYear
            currentState = End.endOfYear(currentState);
            test = Season.Spring;
        }
        EndGame check = new EndGame();
        check.endGame(moyenne, currentState.difficulty, currentState.score);
        }

    }
}