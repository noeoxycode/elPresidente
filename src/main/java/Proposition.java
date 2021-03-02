public class Proposition {
    private String title;
    private int capitalistes =0;
    private int communistes =0;
    private int libéraux =0;
    private int religieux =0;
    private int militaristes =0;
    private int ecologistes =0;
    private int nationalistes =0;
    private int loyalistes =0;

    public Proposition(String title) {
        this.title = title;
    }

    public void setCapitalistes(int capitalistes) { this.capitalistes = capitalistes; }

    public void setCommunistes(int communistes) {
        this.communistes = communistes;
    }

    public void setLibéraux(int libéraux) {
        this.libéraux = libéraux;
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
        currentGameState.setCapitalistes(this.capitalistes);
        currentGameState.setCommunistes(this.communistes);
        currentGameState.setLiberaux(this.libéraux);
        currentGameState.setLoyalistes(this.loyalistes);
        currentGameState.setNationalistes(this.nationalistes);
        currentGameState.setMilitaristes(this.militaristes);
        currentGameState.setReligieux(this.religieux);
        currentGameState.setEcologistes(this.ecologistes);
    }
}

