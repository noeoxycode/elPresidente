import java.util.Random;
import java.util.Scanner;

public class endOfTheYear {
    public GameState endOfYear(GameState currentState){
        boolean result = false;
        int i = 0;
        int exit = 0;
        System.out.println("\n");
        System.out.println("---------------------------");
        System.out.println("\n");
        System.out.println("This is the end of the year !");
        System.out.println("\n");
        System.out.println("---------------------------");
        System.out.println("\n");
        while (!result){
            System.out.println("Now choose one of these proposals:");
            System.out.println("1 is for Bribe\n2 is for Food Market\n3 is for To leave it like it is now");
            Scanner scan = new Scanner(System.in);
            i = scan.nextInt();
            switch(i){
                case 1:
                    //appeler Bribe
                    System.out.println("You chose to corrupt a faction");
                    System.out.println("Now, pick the faction that you want to corrupt :");
                    Faction faction = pickFaction(currentState);
                    Bribe(currentState, faction);
                    break;
                case 2:
                    //appeler Food Market
                    foodMarket(currentState);
                    break;
                case 3:
                    result = true;
                    break;
                default:
                    System.out.println("Error, please try again");
                    break;
            }
        }
        //appeler end of year review
        EndOfYearReview(currentState);
        System.out.println("See you next year\n");
        return currentState;
    }

    public Faction pickFaction(GameState currentState){
        System.out.println("Pick the faction that you want to corrupt with the right number :");
        System.out.println("1 for capitalistes");
        System.out.println("2 for communistes");
        System.out.println("3 for liberaux");
        System.out.println("4 for religieux");
        System.out.println("5 for militaristes");
        System.out.println("6 for ecologistes");
        System.out.println("7 for nationalistes");
        System.out.println("8 for loyalistes");

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        return switch (i) {
            case 1 -> currentState.capitalistes;
            case 2 -> currentState.communistes;
            case 3 -> currentState.liberaux;
            case 4 -> currentState.religieux;
            case 5 -> currentState.militaristes;
            case 6 -> currentState.ecologistes;
            case 7 -> currentState.nationalistes;
            case 8 -> currentState.loyalistes;
            default -> pickFaction(currentState);
        };
    }


    public GameState Bribe(GameState currentState, Faction faction){
        //on montre le % du parti et on propose de soudoyer en exposant le prix, et l'argent que l'on possède
        System.out.println("The " + faction.getName() + " are " + faction.getPopulation() + " and " + faction.getPopularity() + "% of them like you");
        int corruptionCost = faction.getCorruptionCost();
        System.out.println("To upgrade their grade, you will need to pay " + corruptionCost + " dollars" );
        System.out.println("Actually, you have " + currentState.money + " dollars");
        System.out.println("Would you like to make a bribe ?");
        System.out.println("1 for yes   2 for no");
        boolean check = false;
        //la boucle sert en cas de saisie d'un mauvais numéro
        while (!check)
        {
            int i;
            Scanner scan = new Scanner(System.in);
            i = scan.nextInt();
            //le joueur veut faire un pot de vin
            if (i == 1)
            {
                CorruptionResult result = faction.corrupt(currentState.money);
                currentState.money = result.newMoney;
                //le joueur a corrompu cette faction
                if (result.isCorrupted)
                {
                    System.out.println("The bribe has been successfully made !");
                    check = true;
                }
                else {
                    System.out.println("Sorry, you do not have enough money !");
                    check = true;
                }
            }
            //le joueur ne veut pas faire de pot de vin
            else if (i == 2)
            {
                System.out.println("You chose to do not make a bride");
                check = true;
            }
            //error
            else {
                System.out.println("Ups ! Wrong number, please try again !");
            }
        }
        return currentState;
    }

    public GameState foodMarket(GameState currentState){
        int i = 0;
        int j = 0;
        boolean check = false;
        System.out.println("\nActually, you have " + currentState.money + " dollars");
        System.out.println("You have "+currentState.nourriture+" food unit.");
        System.out.println("Here's the overall number of supporters "+ currentState.nbrPartGlobal);
        System.out.println("1 for buy\n2 for to leave");
        //choisi si il veut acheter ou pas
        Scanner scan = new Scanner(System.in);
        j = scan.nextInt();
        switch (j){
            case 1:
                while(!check){
                    //choisi le nombre d'unité qu'il veut acheter
                    System.out.println("How many units of food do you want to buy?");
                    i = scan.nextInt();
                    if(i*8 > currentState.money){
                        System.out.println("You do not have enough money");
                    }else{
                        currentState.money = currentState.money-(i*8);
                        currentState.nourriture = currentState.nourriture+i;
                        System.out.println("Your purchase has been made,you have more than "+currentState.money+" of currency, see you soon !\n");
                        check = true;
                    }
                }
                break;
                case 2:
                    System.out.println("See you later\n");
                    break;
                default:
                    System.out.println("Error, please try again");
        }

        return currentState;
    }

    public GameState EndOfYearReview(GameState currentState){
        System.out.println("It's time to take stock of the end of the year.\n");
    int i = new Random().nextInt(10);
        if(currentState.nourriture<0 || currentState.nourriture < (currentState.nbrPartGlobal*4)){
            System.out.println("Too bad, some supporters have left");
            while(currentState.nourriture < 0 || currentState.nourriture < (currentState.nbrPartGlobal*4)){
                currentState.nbrPartGlobal--;
                currentState.nourriture = currentState.nourriture + 4;
                if(currentState.nbrPartGlobal<0){
                    EndGame end = new EndGame();
                    end.endGame(currentState.moyenne, currentState.difficulty, currentState.score);
                }
            }
        }else{
            currentState.nourriture = currentState.nourriture - (currentState.nbrPartGlobal*4);
            System.out.println("Congratulations, the number of supporters has just increased");
            currentState.nbrPartGlobal = currentState.nbrPartGlobal*i;
        }

        return currentState;
    }
}
