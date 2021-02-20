import java.util.Scanner;

public class ChoiceScenario {
    public static String tab;
    static Scenario s;
    //fonction qui permet de choisir le scénario
    public static void ChoiceScenario() {
        int i = 0;
        int j = 1;
        int length;
        //affiche tout les scénarios
        System.out.println("You chose the scenario mode.\n");
        System.out.println("Now choose a scenario:");
        //Initialise le tableau list avec tout les scénario possible
        s.Initialisation();
        //récupère la taille du tableau
        length = s.GetLength();
        //affiche tout les scénario
        for (int k = 0; k < length && s.list[k] != null;k++){
            System.out.println(j+" for "+s.list[k]);
            j++;
        }
        //récupère la valeur que le joueur à écrit dans la console
        Scanner scan2 = new Scanner(System.in);
        i = scan2.nextInt();
        //récupère le titre du scénario choisi par le joueur
        tab = s.GetList(i);
        // game set up
    }
}
