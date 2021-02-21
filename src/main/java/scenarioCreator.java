import java.util.ArrayList;
//création des scénarios avec leurs tags
public class scenarioCreator {

    private ArrayList<Scenario> scenarioList = new ArrayList<Scenario>();

    public scenarioCreator(){

        Scenario scenario1 = new Scenario();
        scenario1.title = "Sandbox";
        scenarioList.add(scenario1);

        Scenario scenario2 = new Scenario();
        scenario2.title = "Guerre";
        scenario2.tags.add("guerre");
        scenarioList.add(scenario2);

        Scenario scenario3 = new Scenario();
        scenario3.title = "Guerre civile";
        scenario3.tags.add("guerre civile");
        scenarioList.add(scenario3);
    }
    //fournit la liste des scenarios
    public ArrayList<Scenario> getScenarioList(){
        return scenarioList;
    }

}
