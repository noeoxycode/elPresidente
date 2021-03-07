import java.util.Random;

public class GameState {
    public float capitalistes = 50;
    public float communistes = 50;
    public float liberaux= 50;
    public float religieux= 50;
    public float militaristes= 50;
    public float ecologistes= 50;
    public float nationalistes= 50;
    public float loyalistes= 50;
    public int difficulty = 1;
    public int score = 0;
    public int nbCapitalistes = new Random().nextInt(20);
    public int nbCommunistes = new Random().nextInt(20);
    public int nbLiberaux= new Random().nextInt(20);
    public int nbReligieux= new Random().nextInt(20);
    public int nbMilitaristes= new Random().nextInt(20);
    public int nbEcologistes= new Random().nextInt(20);
    public int nbNationalistes= new Random().nextInt(20);
    public int nbLoyalistes= new Random().nextInt(20);
    public int industrialPart = 100;
    public int agriculturePart = 100;
    public int nourriture = 0;
    public int money = 200;


    public int getScore() {
        return score;
    }

    public Season currentSeason = Season.Spring;

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }


}


