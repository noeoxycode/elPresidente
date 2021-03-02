import java.util.ArrayList;
//création des scénarios avec leurs tags
public class ScenarioCreator {
    public static ArrayList<Scenario> create(){
        ArrayList<Scenario> scenarioList = new ArrayList<>();

        Event event1 = new Event("Bombardement", Season.All);

        Proposition proposition1Bombardement = new Proposition("Abattre les bombardiers");
        proposition1Bombardement.setCapitalistes(3);
        proposition1Bombardement.setLiberaux(2);
        proposition1Bombardement.setCommunistes(-3);
        proposition1Bombardement.setEcologistes(-1);


        Proposition proposition2Bombardement = new Proposition("Contre-attaquer");
        proposition2Bombardement.setMilitaristes(5);
        proposition2Bombardement.setNationalistes(-3);
        proposition2Bombardement.setLoyalistes(3);
        proposition2Bombardement.setReligieux(-3);


        event1.addProposition(proposition2Bombardement);
        event1.addProposition(proposition1Bombardement);


        Scenario scenario0 = new Scenario("Sandbox");
        scenarioList.add(scenario0);
        scenario0.addEvent(event1);

        Scenario scenario1 = new Scenario("Guerre");
        scenarioList.add(scenario1);
        scenario1.addEvent(event1);

        Scenario scenario2 = new Scenario("Guerre civile");
        scenarioList.add(scenario2);

        return scenarioList;
    }
}
