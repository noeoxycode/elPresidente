import java.util.Random;

public class GameState {
    public Faction capitalistes = new Faction("capitaliste", new Random().nextInt(20), 50);
    public Faction communistes = new Faction("communistes", new Random().nextInt(20), 50);
    public Faction liberaux= new Faction("liberaux", new Random().nextInt(20), 50);
    public Faction religieux= new Faction("religieux", new Random().nextInt(20), 50);
    public Faction militaristes= new Faction("militaristes", new Random().nextInt(20), 50);
    public Faction ecologistes= new Faction("ecologistes", new Random().nextInt(20), 50);
    public Faction nationalistes= new Faction("nationalistes", new Random().nextInt(20), 50);
    public Faction loyalistes= new Faction("loyalistes", new Random().nextInt(20), 50);
    public int difficulty = 1;
    public int score = 0;
    public float moyenne;
    public int industrialPart = 100;
    public int agriculturePart = 100;
    public int nourriture = 0;
    public int money = 200;
    public int nbrPartGlobal;


    public int getScore() {
        return score;
    }

    public Season currentSeason = Season.Spring;

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
}


