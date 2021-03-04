import java.util.ArrayList;
//création des scénarios avec leurs tags
public class ScenarioCreator {
    public static ArrayList<Scenario> create(){
        ArrayList<Scenario> scenarioList = new ArrayList<>();

        Event event1 = new Event("Bombardement", Season.All);

        Proposition proposition1Bombardement = new Proposition("Abattre les bombardiers");
        proposition1Bombardement.setMilitaristes(5);
        proposition1Bombardement.setCapitalistes(3);
        proposition1Bombardement.setLibéraux(2);
        proposition1Bombardement.setCommunistes(-3);
        proposition1Bombardement.setEcologistes(-4);


        Proposition proposition2Bombardement = new Proposition("Contre-attaquer");
        proposition1Bombardement.setEcologistes(-4);
        proposition2Bombardement.setMilitaristes(5);
        proposition2Bombardement.setNationalistes(-3);
        proposition2Bombardement.setLoyalistes(3);

        event1.addProposition(proposition1Bombardement);
        event1.addProposition(proposition2Bombardement);

        Event event2 = new Event("Attaque de gaz", Season.All);

        Proposition proposition1Gaz = new Proposition("Fournir des masques à gaz à toute la population");
        proposition1Gaz.setMilitaristes(-5);
        proposition1Gaz.setCapitalistes(-3);
        proposition1Gaz.setCommunistes(-3);
        proposition1Gaz.setEcologistes(1);
        proposition1Gaz.setNationalistes(3);

        Proposition proposition2Gaz = new Proposition("Contre-attaquer");
        proposition2Gaz.setEcologistes(-4);
        proposition2Gaz.setMilitaristes(5);
        proposition2Gaz.setNationalistes(-3);
        proposition2Gaz.setLoyalistes(3);

        event2.addProposition(proposition1Gaz);
        event2.addProposition(proposition2Gaz);

        Event event3 = new Event("Faiblesse détéctée dans les défenses ennemis", Season.All);

        Proposition proposition1Faiblesse = new Proposition("Foncer et détruire les défenses");
        proposition1Faiblesse.setMilitaristes(5);
        proposition1Faiblesse.setCapitalistes(3);
        proposition1Faiblesse.setCommunistes(-3);
        proposition1Faiblesse.setEcologistes(-1);
        proposition1Faiblesse.setNationalistes(3);
        proposition1Faiblesse.setLibéraux(5);

        Proposition proposition2Faiblesse = new Proposition("Non, c'est surement un piège");
        proposition2Faiblesse.setEcologistes(4);
        proposition2Faiblesse.setMilitaristes(-5);
        proposition2Faiblesse.setNationalistes(-3);
        proposition2Faiblesse.setLoyalistes(3);
        proposition2Faiblesse.setCommunistes(3);

        event3.addProposition(proposition1Faiblesse);
        event3.addProposition(proposition2Faiblesse);

        Event event4 = new Event("Soulèvement de la population", Season.All);

        Proposition proposition1Population = new Proposition("Abattre les révolutionnaires");
        proposition1Population.setMilitaristes(2);
        proposition1Population.setCapitalistes(-4);
        proposition1Population.setCommunistes(3);
        proposition1Population.setNationalistes(-4);
        proposition1Population.setLoyalistes(1);
        proposition1Population.setReligieux(-3);
        proposition1Population.setLibéraux(-5);

        Proposition proposition2Population = new Proposition("Ecouter les revendications");
        proposition2Population.setEcologistes(4);
        proposition2Population.setMilitaristes(-2);
        proposition2Population.setNationalistes(4);
        proposition2Population.setCommunistes(-3);
        proposition2Population.setCapitalistes(4);
        proposition2Population.setReligieux(3);

        event4.addProposition(proposition1Population);
        event4.addProposition(proposition2Population);


        Event event5 = new Event("Famine", Season.All);

        Proposition proposition1Famine = new Proposition("Nourrire la population");
        proposition1Famine.setMilitaristes(-5);
        proposition1Famine.setCapitalistes(-4);
        proposition1Famine.setCommunistes(5);
        proposition1Famine.setNationalistes(4);
        proposition1Famine.setLoyalistes(4);
        proposition1Famine.setReligieux(4);
        proposition1Famine.setEcologistes(5);
        proposition1Famine.setLibéraux(5);

        Proposition proposition2Famine = new Proposition("Nourrire l'armée");
        proposition2Famine.setEcologistes(-3);
        proposition2Famine.setMilitaristes(5);
        proposition2Famine.setNationalistes(-4);
        proposition2Famine.setCommunistes(-4);
        proposition2Famine.setCapitalistes(1);
        proposition2Famine.setReligieux(-5);

        event5.addProposition(proposition1Famine);
        event5.addProposition(proposition2Famine);

        Event event6 = new Event("Complot interne à l'armée", Season.All);

        Proposition proposition1Traitre = new Proposition("Fusiller les traitres");
        proposition1Traitre.setMilitaristes(-5);
        proposition1Traitre.setCapitalistes(-4);
        proposition1Traitre.setCommunistes(5);
        proposition1Traitre.setNationalistes(-4);
        proposition1Traitre.setLoyalistes(-4);
        proposition1Traitre.setReligieux(-4);
        proposition1Traitre.setEcologistes(-5);
        proposition1Traitre.setLibéraux(-5);

        Proposition proposition2Traitre = new Proposition("Emprisonner les traitres");
        proposition2Traitre.setEcologistes(1);
        proposition2Traitre.setMilitaristes(2);
        proposition2Traitre.setNationalistes(4);
        proposition2Traitre.setCommunistes(-4);
        proposition2Traitre.setCapitalistes(1);
        proposition2Traitre.setReligieux(2);
        proposition2Traitre.setLoyalistes(4);

        event6.addProposition(proposition1Traitre);
        event6.addProposition(proposition2Traitre);

        Event event7 = new Event("Tempete de neige", Season.Winter);

        Proposition proposition1Neige = new Proposition("Aider la population");
        proposition1Neige.setMilitaristes(-2);
        proposition1Neige.setCapitalistes(-1);
        proposition1Neige.setCommunistes(3);
        proposition1Neige.setNationalistes(4);
        proposition1Neige.setLoyalistes(4);
        proposition1Neige.setReligieux(4);
        proposition1Neige.setEcologistes(-5);
        proposition1Neige.setLibéraux(0);

        Proposition proposition2Neige = new Proposition("ne rien faire");
        proposition2Neige.setEcologistes(1);
        proposition2Neige.setMilitaristes(2);
        proposition2Neige.setNationalistes(-4);
        proposition2Neige.setCommunistes(-4);
        proposition2Neige.setCapitalistes(-1);
        proposition2Neige.setReligieux(-2);
        proposition2Neige.setLoyalistes(-4);

        event7.addProposition(proposition1Neige);
        event7.addProposition(proposition2Neige);

        Event event8 = new Event("Sécheresse", Season.Summer);

        Proposition proposition1secheresse = new Proposition("Aider la population");
        proposition1secheresse.setMilitaristes(-2);
        proposition1secheresse.setCapitalistes(-1);
        proposition1secheresse.setCommunistes(3);
        proposition1secheresse.setNationalistes(4);
        proposition1secheresse.setLoyalistes(4);
        proposition1secheresse.setReligieux(4);
        proposition1secheresse.setEcologistes(-5);
        proposition1secheresse.setLibéraux(0);

        Proposition proposition2secheresse = new Proposition("ne rien faire");
        proposition2secheresse.setEcologistes(1);
        proposition2secheresse.setMilitaristes(2);
        proposition2secheresse.setNationalistes(-4);
        proposition2secheresse.setCommunistes(-4);
        proposition2secheresse.setCapitalistes(-1);
        proposition2secheresse.setReligieux(-2);
        proposition2secheresse.setLoyalistes(-4);

        event8.addProposition(proposition1secheresse);
        event8.addProposition(proposition2secheresse);


        Event event10 = new Event("Pandémie", Season.All);

        Proposition proposition1Pandemie = new Proposition("Confinement");
        proposition1Pandemie.setCapitalistes(-4);
        proposition1Pandemie.setCommunistes(-2);
        proposition1Pandemie.setNationalistes(4);
        proposition1Pandemie.setLoyalistes(4);
        proposition1Pandemie.setReligieux(4);
        proposition1Pandemie.setEcologistes(5);
        proposition1Pandemie.setLibéraux(-3);


        Proposition proposition2Pandémie = new Proposition("Ne rien faire");
        proposition2Pandémie.setCapitalistes(4);
        proposition2Pandémie.setCommunistes(-2);
        proposition2Pandémie.setNationalistes(-4);
        proposition2Pandémie.setLoyalistes(-4);
        proposition2Pandémie.setReligieux(-4);
        proposition2Pandémie.setEcologistes(-5);
        proposition2Pandémie.setLibéraux(2);


        event10.addProposition(proposition1Pandemie);
        event10.addProposition(proposition2Pandémie);

        Event event11 = new Event("Nouveau variant", Season.All);

        Proposition proposition1NouveauVariant = new Proposition("Recherche nouveau vaccin");
        proposition1NouveauVariant.setCapitalistes(-2);
        proposition1NouveauVariant.setCommunistes(2);
        proposition1NouveauVariant.setNationalistes(4);
        proposition1NouveauVariant.setLoyalistes(4);
        proposition1NouveauVariant.setReligieux(4);
        proposition1NouveauVariant.setEcologistes(1);
        proposition1NouveauVariant.setLibéraux(3);


        Proposition proposition2NouveauVariant = new Proposition("Ne rien faire");
        proposition2NouveauVariant.setCapitalistes(3);
        proposition2NouveauVariant.setCommunistes(-3);
        proposition2NouveauVariant.setNationalistes(-4);
        proposition2NouveauVariant.setLoyalistes(-4);
        proposition2NouveauVariant.setReligieux(-4);
        proposition2NouveauVariant.setEcologistes(-3);
        proposition2NouveauVariant.setLibéraux(-3);


        event11.addProposition(proposition1NouveauVariant);
        event11.addProposition(proposition2NouveauVariant);

        Event event12 = new Event("Crise financière", Season.All);

        Proposition proposition1CriseFinancière = new Proposition("Aider la population");
        proposition1CriseFinancière.setCapitalistes(-3);
        proposition1CriseFinancière.setCommunistes(-3);
        proposition1CriseFinancière.setNationalistes(4);
        proposition1CriseFinancière.setLoyalistes(4);
        proposition1CriseFinancière.setReligieux(4);
        proposition1CriseFinancière.setEcologistes(4);
        proposition1CriseFinancière.setLibéraux(3);


        Proposition proposition2CriseFinancière = new Proposition("Garder l'argent pour plus tard");
        proposition2CriseFinancière.setCapitalistes(4);
        proposition2CriseFinancière.setCommunistes(3);
        proposition2CriseFinancière.setNationalistes(-4);
        proposition2CriseFinancière.setLoyalistes(-4);
        proposition2CriseFinancière.setReligieux(-4);
        proposition2CriseFinancière.setEcologistes(-4);
        proposition2CriseFinancière.setLibéraux(-3);

        event12.addProposition(proposition1CriseFinancière);
        event12.addProposition(proposition2CriseFinancière);

        Event event13 = new Event("2 nouveau vaccins", Season.All);

        Proposition proposition1Vaccin = new Proposition("vaccin 1");
        proposition1Vaccin.setCapitalistes(-4);
        proposition1Vaccin.setCommunistes(-5);
        proposition1Vaccin.setNationalistes(-4);
        proposition1Vaccin.setLoyalistes(-4);
        proposition1Vaccin.setReligieux(-4);
        proposition1Vaccin.setEcologistes(-4);
        proposition1Vaccin.setLibéraux(-5);


        Proposition proposition2Vaccin = new Proposition("vaccin 2");
        proposition2Vaccin.setCapitalistes(4);
        proposition2Vaccin.setCommunistes(4);
        proposition2Vaccin.setNationalistes(4);
        proposition2Vaccin.setLoyalistes(4);
        proposition2Vaccin.setReligieux(4);
        proposition2Vaccin.setEcologistes(4);
        proposition2Vaccin.setLibéraux(5);


        event13.addProposition(proposition1Vaccin);
        event13.addProposition(proposition2Vaccin);





        Scenario scenario0 = new Scenario("Sandbox");
        scenarioList.add(scenario0);
        scenario0.addEvent(event1);

        Scenario scenario1 = new Scenario("Guerre");
        scenarioList.add(scenario1);
        scenario1.addEvent(event1);
        scenario1.addEvent(event2);
        scenario1.addEvent(event3);
        scenario1.addEvent(event4);
        scenario1.addEvent(event5);
        scenario1.addEvent(event6);
        scenario1.addEvent(event7);
        scenario1.addEvent(event8);

        Scenario scenario2 = new Scenario("Covid-19");
        scenarioList.add(scenario2);
        scenario2.addEvent(event7);
        scenario2.addEvent(event8);
        scenario2.addEvent(event10);
        scenario2.addEvent(event11);
        scenario2.addEvent(event12);
        scenario2.addEvent(event13);
        return scenarioList;
    }
}
