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

    public void apply(GameState currentGameState){
        currentGameState.capitalistes.addPopularity(this.capitalistes);
        currentGameState.communistes.addPopularity(this.communistes);
        currentGameState.liberaux.addPopularity(this.liberaux);
        currentGameState.loyalistes.addPopularity(this.loyalistes);
        currentGameState.nationalistes.addPopularity(this.nationalistes);
        currentGameState.militaristes.addPopularity(this.militaristes);
        currentGameState.religieux.addPopularity(this.religieux);
        currentGameState.ecologistes.addPopularity(this.ecologistes);
    }

    @Override
    public String toString() {
        return getTitle();
}}

