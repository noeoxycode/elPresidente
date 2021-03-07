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
            System.out.println("1 is for Bribe\n2 is for Food Market\n3 is for Year-end review\n4 is for To leave it mlike it is now");
            Scanner scan = new Scanner(System.in);
            i = scan.nextInt();
            switch(i){
                case 1:
                    //appeler Bribe
                    Bribe(currentState);
                    break;
                case 2:
                    //appeler Food Market
                    foodMarket(currentState);
                    break;
                case 3:
                    //appeler Year-end review
                    break;
                case 4:
                    System.out.println("See you next year");
                    result = true;
                default:
                    System.out.println("Error, please try again");
                    break;
            }
        }
        return currentState;
    }

//Trouver un moyen d'appliquer ce code à toutes les factions
    //idée :
//au moment où on selectionne bride dans endOfTheYear, lui demander quelle section soudoyer, et appeler ensuite bride avec en paramètre le nom de la faction
//et donc il soudoierait toutes les factions voulues une par une
    public GameState Bribe(GameState currentState){
        //on montre le % du parti et on propose de soudoyer en exposant le prix, et l'argent que l'on possède
        System.out.println("The capitalist are " + currentState.nbCapitalistes + " and " + currentState.capitalistes + "% of them like you");
        int costCapitalist = currentState.nbCapitalistes * 15;
        System.out.println("To upgrade their grade, you will need to pay " + costCapitalist + " dollars" );
        System.out.println("Actually, you have " + currentState.money + " dollars");
        System.out.println("Would you like to make a ribes ?");
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
                //on vérifie que le joueur possède assez d'argent
                if (0 < (currentState.money - costCapitalist))
                {
                    currentState.capitalistes += 10;
                    //on check que le % n'eccede pas 100%
                    if (currentState.capitalistes > 100)
                        currentState.capitalistes = 100;
                    currentState.money = currentState.money - costCapitalist;
                    System.out.println("The bribe has been successfully made !");
                    check = true;
                }
                //quand ce cas arrive, le programme est coincé, essayer de le décoincer
                else {
                    System.out.println("Sorry, you do not have anought money !");
                    check = false;
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
        System.out.println("\nYour currency is: " +currentState.money);
        System.out.println("You have "+currentState.nourriture+" food unit.");
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
        }

        return currentState;
    }

}
