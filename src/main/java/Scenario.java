public class Scenario {
    //retourne le titre du scénario choisi
    public static String GetList(int j){
       int i = j-1;
       String [] list = new String[35];
       list[0] = "scenario1";
       list[1] = "titre2";
       list[2] = "titre3";
       list[3] = "titre3";
       return list[i];
    }
}
