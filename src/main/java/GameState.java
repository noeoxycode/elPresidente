public class GameState {
    public int capitalistes = 50;
    public int communistes;
    public int liberaux;
    public int religieux;
    public int militaristes;
    public int ecologistes;
    public int nationalistes;
    public int loyalistes;
    public int difficulty = 1;

    public Season currentSeason = Season.Spring;

    public void setCapitalistes(int capitalistes) {
        this.capitalistes = capitalistes;
    }

    public void setCommunistes(int communistes) {
        this.communistes = communistes;
    }

    public void setLiberaux(int liberaux) {
        this.liberaux = liberaux;
    }

    public void setReligieux(int religieux) {
        this.religieux = religieux;
    }

    public void setMilitaristes(int militaristes) {
        this.militaristes = militaristes;
    }

    public void setEcologistes(int ecologistes) {
        this.ecologistes = ecologistes;
    }

    public void setNationalistes(int nationalistes) {
        this.nationalistes = nationalistes;
    }

    public void setLoyalistes(int loyalistes) {
        this.loyalistes = loyalistes;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
}


