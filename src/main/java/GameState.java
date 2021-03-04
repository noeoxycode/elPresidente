public class GameState {
    public int capitalistes = 50;
    public int communistes = 50;
    public int liberaux= 50;
    public int religieux= 50;
    public int militaristes= 50;
    public int ecologistes= 50;
    public int nationalistes= 50;
    public int loyalistes= 50;
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


