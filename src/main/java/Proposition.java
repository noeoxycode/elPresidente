public class Proposition {
    private String title;
    private int capitalistes =0;
    private int communistes =0;
    private int liberaux =0;
    private int religieux =0;
    private int militaristes =0;
    private int ecologistes =0;
    private int nationalistes =0;
    private int loyalistes =0;

    public Proposition(String title) {
        this.title = title;
    }

    public void setCapitalistes(int capitalistes) {
        this.capitalistes = capitalistes;
    }

    public void setCommunistes(int communistes) {
        this.communistes = communistes;
    }

    public void setLibéraux(int liberaux) {
        this.liberaux = liberaux;
    }

    public void setReligieux(int religieux) {
        this.religieux = religieux;
    }

    public void setMilitaristes(int militaristes) { this.militaristes = militaristes; }

    public void setEcologistes(int ecologistes) {
        this.ecologistes = ecologistes;
    }

    public void setNationalistes(int nationalistes) { this.nationalistes = nationalistes; }

    public void setLoyalistes(int loyalistes) {
        this.loyalistes = loyalistes;
    }

    public GameState apply(GameState currentGameState,Proposition proposition){
        currentGameState.capitalistes += proposition.capitalistes;
        currentGameState.communistes += proposition.communistes;
        currentGameState.liberaux += proposition.liberaux;
        currentGameState.loyalistes += proposition.loyalistes;
        currentGameState.nationalistes += proposition.nationalistes;
        currentGameState.militaristes += proposition.militaristes;
        currentGameState.religieux += proposition.religieux;
        currentGameState.ecologistes += proposition.ecologistes;
        return currentGameState;
    }
}

