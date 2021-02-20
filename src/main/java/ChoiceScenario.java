import java.util.Scanner;

public class ChoiceScenario {
    public static String tab;
    static Scenario s;
    //fonction qui permet de choisir le scénario
    public static void ChoiceScenario() {
        int i = 0;
        //affiche tout les scénarios
        System.out.println("You chose the scenario mode.\n");
        System.out.println("Now choose a scenario:");
        System.out.println("1 for scenario 1");
        System.out.println("2 for scenario 2");
        System.out.println("3 for scenario 3");
        //récupère la valeur que le joueur à écrit dans la console
        Scanner scan2 = new Scanner(System.in);
        i = scan2.nextInt();
        //récupère le titre du scénario choisi par le joueur
        tab = s.GetList(i);
        // game set up
    }
}
