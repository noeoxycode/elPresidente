import java.util.ArrayList;
//création des scénarios avec leurs tags
public class scenarioCreator {

    private ArrayList<Scenario> scenarioList = new ArrayList<Scenario>();

    public scenarioCreator(){

        Scenario scenario0 = new Scenario();
        scenario0.title = "Sandbox";
        scenarioList.add(scenario0);

        Scenario scenario1 = new Scenario();
        scenario1.title = "Guerre";
        scenario1.tags.add("guerre");
        scenarioList.add(scenario1);

        Scenario scenario2 = new Scenario();
        scenario2.title = "Guerre civile";
        scenario2.tags.add("guerre civile");
        scenarioList.add(scenario2);
    }
    //fournit la liste des scenarios
    public ArrayList<Scenario> getScenarioList(){
        return scenarioList;
    }

}
