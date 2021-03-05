public class Proposition {
    private String title;
    private float capitalistes =0;
    private float communistes =0;
    private float liberaux =0;
    private float religieux =0;
    private float militaristes =0;
    private float ecologistes =0;
    private float nationalistes =0;
    private float loyalistes =0;

    public Proposition(String title) {
        this.title = title;
    }

    public String getTitle(){return title;}

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

    @Override
    public String toString() {
        return getTitle();
}}

