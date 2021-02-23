import java.util.ArrayList;
//constructeur de scenario
public class Scenario {

    private String title;
    private ArrayList<Event> scenarioEventList = new ArrayList<Event>();

    public Scenario(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Event> getScenarioEventList() {

        return scenarioEventList;
    }

    public void addEvent(Event event) {

        scenarioEventList.add(event);
    }

    @Override
    public String toString() {

        return title;
    }
}