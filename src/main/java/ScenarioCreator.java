import java.util.ArrayList;
//création des scénarios avec leurs tags
public class ScenarioCreator {
    public static ArrayList<Scenario> create(){
        ArrayList<Scenario> scenarioList = new ArrayList<>();

        Event event1 = new Event("Bombardement", Season.All);

        Proposition proposition1Bombardement = new Proposition("Abattre les bombardiers");
        proposition1Bombardement.setCapitalistes(3);
        proposition1Bombardement.setLibéraux(2);
        proposition1Bombardement.setCommunistes(-3);
        proposition1Bombardement.setEcologistes(-1);


        Proposition proposition2Bombardement = new Proposition("Contre-attaquer");
        proposition2Bombardement.setMilitaristes(5);
        proposition2Bombardement.setNationalistes(-3);
        proposition2Bombardement.setLoyalistes(3);
        proposition2Bombardement.setReligieux(-3);


        event1.addProposition(proposition2Bombardement);
        event1.addProposition(proposition1Bombardement);

        Event event2 = new Event("Pandémie", Season.All);

        Proposition proposition1Pandemie = new Proposition("Confinement");
        proposition1Pandemie.setCapitalistes(3);
        proposition1Pandemie.setLibéraux(2);
        proposition1Pandemie.setCommunistes(-3);
        proposition1Pandemie.setEcologistes(-1);


        Proposition proposition2Pandémie = new Proposition("Ne rien faire");
        proposition2Pandémie.setMilitaristes(5);
        proposition2Pandémie.setEcologistes(-3);
        proposition2Pandémie.setLoyalistes(3);
        proposition2Pandémie.setReligieux(-3);


        event2.addProposition(proposition1Pandemie);
        event2.addProposition(proposition2Pandémie);

        Event event3 = new Event("Nouveau variant", Season.All);

        Proposition proposition1NouveauVariant = new Proposition("Recherche nouveau vaccin");
        proposition1NouveauVariant.setCapitalistes(3);
        proposition1NouveauVariant.setLibéraux(2);
        proposition1NouveauVariant.setCommunistes(-3);
        proposition1NouveauVariant.setEcologistes(-1);


        Proposition proposition2NouveauVariant = new Proposition("Ne rien faire");
        proposition2NouveauVariant.setMilitaristes(5);
        proposition2NouveauVariant.setEcologistes(-3);
        proposition2NouveauVariant.setLoyalistes(3);
        proposition2NouveauVariant.setReligieux(-3);


        event3.addProposition(proposition1NouveauVariant);
        event3.addProposition(proposition2NouveauVariant);

        Scenario scenario0 = new Scenario("Sandbox");
        scenarioList.add(scenario0);
        scenario0.addEvent(event1);

        Scenario scenario1 = new Scenario("Guerre");
        scenarioList.add(scenario1);
        scenario1.addEvent(event1);
        scenario1.addEvent(event2);
        scenario1.addEvent(event3);

        Scenario scenario2 = new Scenario("Covid-19");
        scenarioList.add(scenario2);
        scenario2.addEvent(event3);

        return scenarioList;
    }
}
