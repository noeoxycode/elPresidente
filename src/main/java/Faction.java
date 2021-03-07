import javax.xml.namespace.QName;

public class Faction {
    private String name;
    private int population;
    private float popularity;

    public Faction(String name, int population, float popularity) {
        this.name = name;
        this.population = population;
        this.popularity = popularity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public float getPopularity() {
        return popularity;
    }

    public void setPopularity(float popularity) {
        if (popularity > 100)
            popularity = 100;
        else if (popularity < 0)
            popularity = 0;
        this.popularity = popularity;
    }

    public void addPopularity(float popularity)
    {
        this.setPopularity(this.getPopularity() + popularity);
    }

    public CorruptionResult corrupt(int money){
        int cost = this.getCorruptionCost();
        if (cost > money)
        {
            //pas assez d'argent
            return new CorruptionResult(false, money);
        }
        else
        {
            this.addPopularity(10);
            return new CorruptionResult(true, (money-cost));
        }
    }

    public int getCorruptionCost(){
        return this.getPopulation()*15;
    }


}
