import java.util.ArrayList;

public class Event {
    private String title;
    private Season season;
    private ArrayList<Proposition> propositions = new ArrayList<>();

    public Event(String title, Season season)
    {
        this.title = title;
        this.season = season;
    }

    public void addProposition(Proposition proposition){
        this.propositions.add(proposition);
    }

    public boolean checkSeason (Season season){
        if (this.season == Season.All)
            return true;
        else if(season == this.season ){
            return true;
        }
        else {return false;}

    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Proposition> getPropositions()
    {
        return propositions;
    }

    @Override
    public String toString() {
        return getTitle();
    }

}
