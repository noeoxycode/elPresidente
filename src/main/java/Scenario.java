public class Scenario {

    static String [] list = new String[100];
    //retourne le titre du scénario choisi
    public static String GetList(int j){
       int i = j-1;
       return list[i];
    }
    //Initialise le tableau
    public static void Initialisation(){
        list[0] = "scenario1";
        list[1] = "titre2";
        list[2] = "titre3";
        list[3] = "titre4";
    }
    //return la taille
    public static int GetLength(){
        return list.length;
    }
}
