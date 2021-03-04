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

    public int getScore() {
        return score;
    }

    public Season currentSeason = Season.Spring;

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }


}


